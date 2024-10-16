package com.school.educcom.infrastructure.persistence;

import com.school.educcom.domain.UserRepository;
import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.entity.User;
import com.school.educcom.infrastructure.persistence.jpa.JpaUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DefaultUserRepository implements UserRepository {

  private final JpaUserRepository userRepository;

  @Override
  public UserDTO findById(Long userId) {
    return userToUserDTO(
        userRepository
            .findById(userId).orElseThrow());
  }

  @Override
  public UserDTO findByUsername(String userName) {
    return userToUserDTO(
        userRepository
            .findByUsername(userName)
            .orElseThrow());
  }

  @Override
  public UserDTO save(UserDTO userDTO) {
    return userToUserDTO(userRepository.save(userDTOToUser(userDTO)));
  }

  private UserDTO userToUserDTO(User user) {
    return new UserDTO(
        user.getId(), user.getUserName(), user.getName(), user.getSurName(), user.getSurName2(), user.getPassword());
  }

  private User userDTOToUser(UserDTO user) {
    return new User(user.getId(), user.getUserName(), user.getName(), user.getSurName(), user.getSurName2(), user.getPassword());
  }
}
