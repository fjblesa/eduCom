package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T11:38:58+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userDTO.getId() );
        userEntity.setUserName( userDTO.getUserName() );
        userEntity.setName( userDTO.getName() );
        userEntity.setSurName( userDTO.getSurName() );
        userEntity.setSurName2( userDTO.getSurName2() );
        userEntity.setPassword( userDTO.getPassword() );

        return userEntity;
    }

    @Override
    public UserDTO userToUserDTO(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setName( user.getName() );
        userDTO.setSurName( user.getSurName() );
        userDTO.setSurName2( user.getSurName2() );
        userDTO.setPassword( user.getPassword() );

        return userDTO;
    }
}
