package com.school.educcom.domain;

import com.school.educcom.domain.model.UserDTO;

public interface UserRepository {

  UserDTO findById(Long userId);

  UserDTO findByUserName(String userName);

  UserDTO save(UserDTO user);

  UserDTO findByUserNameAndPassword(String userName, String password);
}
