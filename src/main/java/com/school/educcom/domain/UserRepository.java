package com.school.educcom.domain;

import com.school.educcom.domain.enums.Role;
import com.school.educcom.domain.model.UserDTO;
import java.util.List;

public interface UserRepository {

  UserDTO findById(Long userId);

  UserDTO findByUserName(String userName);

  UserDTO save(UserDTO user);

  UserDTO findByUserNameAndPassword(String userName, String password);

  List<UserDTO> findByRole(Role student);

  UserDTO updateUser(UserDTO userRequest);
}
