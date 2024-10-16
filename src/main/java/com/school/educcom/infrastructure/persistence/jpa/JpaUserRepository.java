package com.school.educcom.infrastructure.persistence.jpa;

import com.school.educcom.infrastructure.persistence.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends CrudRepository<User, Long> {
  Optional<User> findByUsername(String username);
}
