package com.school.educcom.application.service;

import com.school.educcom.domain.model.UserDTO;

public interface UserService {

  UserDTO findById(Long userId);

  UserDTO findByUserName(String userName);

  UserDTO findByUserNameAndPassword(String userName, String password);

  UserDTO registerUser(UserDTO userDTO);
}
