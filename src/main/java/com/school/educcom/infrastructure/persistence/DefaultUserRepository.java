package com.school.educcom.infrastructure.persistence;

import com.school.educcom.domain.UserRepository;
import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.jpa.JpaUserRepository;
import com.school.educcom.infrastructure.persistence.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DefaultUserRepository implements UserRepository {
  
  private final UserMapper userMapper;
  private final JpaUserRepository userRepository;

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