package com.school.educcom.application.service;

import com.school.educcom.domain.UserRepository;
import com.school.educcom.domain.enums.Role;
import com.school.educcom.domain.model.UserDTO;
import java.util.List;
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
  public UserDTO findByUserNameAndPassword(String userName, String password) {
    return userRepository.findByUserNameAndPassword(userName, password);
  }

  @Override
  public UserDTO registerUser(UserDTO userDTO) {
    validateIfExist(userDTO.getUserName());
    return userRepository.save(userDTO);
  }

  @Override
  public List<UserDTO> findByRole(Role student) {
    return userRepository.findByRole(student);
  }

  private void validateIfExist(String userName) {
    UserDTO userDTO = userRepository.findByUserName(userName);
    if (userDTO == null) {
      return;
    }
    throw new RuntimeException("The user already exist");
  }
}