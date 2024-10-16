package com.school.educcom.infrastructure.persistence;

import com.school.educcom.domain.UserRepository;
import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.jpa.JpaUserRepository;
import com.school.educcom.infrastructure.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserRepository implements UserRepository {

  @Autowired
  private UserMapper userMapper;
  @Autowired
  private  JpaUserRepository userRepository;

  @Override
  public UserDTO findById(Long userId) {
    return userMapper.userToUserDTO(
        userRepository
            .findById(userId).orElseThrow());
    
  }

  @Override
  public UserDTO findByUserName(String userName) {
    return userMapper.userToUserDTO(
        userRepository
            .findByUserName(userName)
            .orElseThrow());
  }

  @Override
  public UserDTO save(UserDTO userDTO) {
    return userMapper.userToUserDTO(userRepository.save(userMapper.userDTOToUser(userDTO)));
    
  }
}