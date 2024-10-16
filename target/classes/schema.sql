-- Tabla para 'user'
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    surname2 VARCHAR(255),
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL
);

-- Tabla para 'subject'
CREATE TABLE subject (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Tabla para 'message'
CREATE TABLE message (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    content TEXT NOT NULL,
    sender_id BIGINT NOT NULL,
    receiver_id BIGINT NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    read BOOLEAN NOT NULL DEFAULT FALSE,
    FOREIGN KEY (sender_id) REFERENCES users(id),
    FOREIGN KEY (receiver_id) REFERENCES users(id)
);

-- Tabla para la relación 'user_subjects' (ManyToMany)
CREATE TABLE user_subjects (
    user_id BIGINT NOT NULL,
    subject_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, subject_id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (subject_id) REFERENCES subject(id)
);