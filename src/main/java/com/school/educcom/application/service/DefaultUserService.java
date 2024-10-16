package com.school.educcom.application.service;

import com.school.educcom.domain.UserRepository;
import com.school.educcom.domain.model.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DefaultUserService implements UserService{

  private final UserRepository userRepository;

  @Override
  public UserDTO findById(Long userId) {
    return userRepository.findById(userId);
  }

  @Override
  public UserDTO findByUserName(String userName) {
    return userRepository.findByUserName(userName);
  }

  @Override
  public UserDTO registerUser(UserDTO userDTO) {
    validateIfExist(userDTO.getUserName());
//        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
    userDTO.setUserName(createUserName(userDTO));
    return userRepository.save(userDTO);
  }

  private void validateIfExist(String userName) {
    UserDTO userDTO = userRepository.findByUserName(userName);
    if (userDTO == null) {
      return;
    }
    throw new RuntimeException("The user already exist");
  }

  private String createUserName(UserDTO userDTO) {
    return userDTO.getName() + userDTO.getSurName() + userDTO.getSurName2();
  }
}