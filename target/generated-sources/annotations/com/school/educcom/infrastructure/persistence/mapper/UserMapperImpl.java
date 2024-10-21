package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-21T12:40:13+0200",
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
        userEntity.setRole( userDTO.getRole() );

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
        userDTO.setRole( user.getRole() );

        return userDTO;
    }

    @Override
    public List<UserDTO> usersToUsersDto(List<UserEntity> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( UserEntity userEntity : users ) {
            list.add( userToUserDTO( userEntity ) );
        }

        return list;
    }
}
