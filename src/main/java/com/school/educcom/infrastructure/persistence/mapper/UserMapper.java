package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
  UserEntity userDTOToUser (UserDTO userDTO);

  UserDTO userToUserDTO (UserEntity user);
}
