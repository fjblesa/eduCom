package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.domain.model.SubjectDTO;
import com.school.educcom.domain.model.UserDTO;
import com.school.educcom.infrastructure.persistence.entity.MessageEntity;
import com.school.educcom.infrastructure.persistence.entity.SubjectEntity;
import com.school.educcom.infrastructure.persistence.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T11:44:52+0200",
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
        userEntity.setSubjects( subjectDTOListToSubjectEntityList( userDTO.getSubjects() ) );
        userEntity.setSentMessages( messageDTOListToMessageEntityList( userDTO.getSentMessages() ) );
        userEntity.setReceivedMessages( messageDTOListToMessageEntityList( userDTO.getReceivedMessages() ) );

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
        userDTO.setSubjects( subjectEntityListToSubjectDTOList( user.getSubjects() ) );
        userDTO.setSentMessages( messageEntityListToMessageDTOList( user.getSentMessages() ) );
        userDTO.setReceivedMessages( messageEntityListToMessageDTOList( user.getReceivedMessages() ) );

        return userDTO;
    }

    protected List<UserEntity> userDTOListToUserEntityList(List<UserDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<UserEntity> list1 = new ArrayList<UserEntity>( list.size() );
        for ( UserDTO userDTO : list ) {
            list1.add( userDTOToUser( userDTO ) );
        }

        return list1;
    }

    protected SubjectEntity subjectDTOToSubjectEntity(SubjectDTO subjectDTO) {
        if ( subjectDTO == null ) {
            return null;
        }

        SubjectEntity subjectEntity = new SubjectEntity();

        subjectEntity.setId( subjectDTO.getId() );
        subjectEntity.setName( subjectDTO.getName() );
        subjectEntity.setUsers( userDTOListToUserEntityList( subjectDTO.getUsers() ) );

        return subjectEntity;
    }

    protected List<SubjectEntity> subjectDTOListToSubjectEntityList(List<SubjectDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<SubjectEntity> list1 = new ArrayList<SubjectEntity>( list.size() );
        for ( SubjectDTO subjectDTO : list ) {
            list1.add( subjectDTOToSubjectEntity( subjectDTO ) );
        }

        return list1;
    }

    protected MessageEntity messageDTOToMessageEntity(MessageDTO messageDTO) {
        if ( messageDTO == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setId( messageDTO.getId() );
        messageEntity.setContent( messageDTO.getContent() );
        messageEntity.setCreationDate( messageDTO.getCreationDate() );
        messageEntity.setRead( messageDTO.getRead() );

        return messageEntity;
    }

    protected List<MessageEntity> messageDTOListToMessageEntityList(List<MessageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<MessageEntity> list1 = new ArrayList<MessageEntity>( list.size() );
        for ( MessageDTO messageDTO : list ) {
            list1.add( messageDTOToMessageEntity( messageDTO ) );
        }

        return list1;
    }

    protected List<UserDTO> userEntityListToUserDTOList(List<UserEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<UserDTO> list1 = new ArrayList<UserDTO>( list.size() );
        for ( UserEntity userEntity : list ) {
            list1.add( userToUserDTO( userEntity ) );
        }

        return list1;
    }

    protected SubjectDTO subjectEntityToSubjectDTO(SubjectEntity subjectEntity) {
        if ( subjectEntity == null ) {
            return null;
        }

        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setId( subjectEntity.getId() );
        subjectDTO.setName( subjectEntity.getName() );
        subjectDTO.setUsers( userEntityListToUserDTOList( subjectEntity.getUsers() ) );

        return subjectDTO;
    }

    protected List<SubjectDTO> subjectEntityListToSubjectDTOList(List<SubjectEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SubjectDTO> list1 = new ArrayList<SubjectDTO>( list.size() );
        for ( SubjectEntity subjectEntity : list ) {
            list1.add( subjectEntityToSubjectDTO( subjectEntity ) );
        }

        return list1;
    }

    protected MessageDTO messageEntityToMessageDTO(MessageEntity messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setId( messageEntity.getId() );
        messageDTO.setContent( messageEntity.getContent() );
        messageDTO.setCreationDate( messageEntity.getCreationDate() );
        messageDTO.setRead( messageEntity.getRead() );

        return messageDTO;
    }

    protected List<MessageDTO> messageEntityListToMessageDTOList(List<MessageEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<MessageDTO> list1 = new ArrayList<MessageDTO>( list.size() );
        for ( MessageEntity messageEntity : list ) {
            list1.add( messageEntityToMessageDTO( messageEntity ) );
        }

        return list1;
    }
}
