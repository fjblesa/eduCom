-- Inserción de datos en la tabla 'user'
INSERT INTO users (username, name, surname, surname2, password, role) VALUES
('johndoe', 'John', 'Doe', 'Smith', 'password123', 'STUDENT'),
('janedoe', 'Jane', 'Doe', 'Johnson', 'password456', 'TEACHER'),
('marksmith', 'Mark', 'Smith', NULL, 'password789', 'TEACHER');

-- Inserción de datos en la tabla 'subject'
INSERT INTO subject (name) VALUES 
('Mathematics'),
('Physics'),
('Chemistry');

-- Inserción de datos en la tabla 'message'
INSERT INTO message (content, sender_id, receiver_id, sender_name, receiver_name, creation_date, read) VALUES
('Hello, how are you?', 1, 2,'John Doe Smith', 'John Doe Johnson', NOW(), FALSE),
('Reminder: Homework due tomorrow', 2, 1,'John Doe Johnson', 'John Doe Smith', NOW(), FALSE),
('What time is the meeting?', 1, 3, 'John Doe Smith', 'Mark Smith',  NOW(), FALSE);

-- Inserción de datos en la tabla 'user_subjects'
INSERT INTO user_subjects (user_id, subject_id) VALUES 
(1, 1),  -- John Doe está en Matemáticas
(1, 2),  -- John Doe está en Física
(2, 1),  -- Jane Doe enseña Matemáticas
(2, 2),  -- Jane Doe enseña Física
(3, 2);  -- Mark Smith enseña Física
