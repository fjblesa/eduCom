package com.school.educcom.application.service;

import com.school.educcom.domain.model.UserDTO;

public interface UserService {

  UserDTO findById(Long userId);

  UserDTO findUserByUserName(String userName);

  UserDTO registerUser(UserDTO userDTO);
}
