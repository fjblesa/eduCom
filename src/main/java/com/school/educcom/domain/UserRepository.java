package com.school.educcom.domain;

import com.school.educcom.domain.model.UserDTO;

public interface UserRepository {

  UserDTO findById(Long userId);

  UserDTO findByUsername(String userName);

  UserDTO save(UserDTO user);
}
