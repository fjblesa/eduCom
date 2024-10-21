package com.school.educcom.infrastructure.persistence.jpa;

import com.school.educcom.domain.enums.Role;
import com.school.educcom.infrastructure.persistence.entity.UserEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends CrudRepository<UserEntity, Long> {
  Optional<UserEntity> findByUserName(String username);

  UserEntity findByUserNameAndPassword(String userName, String password);

  List<UserEntity> findByRole(Role student);
}
