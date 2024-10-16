package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.infrastructure.persistence.entity.MessageEntity;
import com.school.educcom.infrastructure.persistence.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T15:42:16+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Azul Systems, Inc.)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageDTO messageToMessageDTO(MessageEntity messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setSenderId( messageEntitySenderId( messageEntity ) );
        messageDTO.setReceiverId( messageEntityReceiverId( messageEntity ) );
        messageDTO.setId( messageEntity.getId() );
        messageDTO.setContent( messageEntity.getContent() );
        messageDTO.setCreationDate( messageEntity.getCreationDate() );
        messageDTO.setRead( messageEntity.getRead() );

        return messageDTO;
    }

    @Override
    public List<MessageDTO> messagesToMessagesDTO(List<MessageEntity> messageEntities) {
        if ( messageEntities == null ) {
            return null;
        }

        List<MessageDTO> list = new ArrayList<MessageDTO>( messageEntities.size() );
        for ( MessageEntity messageEntity : messageEntities ) {
            list.add( messageToMessageDTO( messageEntity ) );
        }

        return list;
    }

    @Override
    public MessageEntity messageDTOToMessage(MessageDTO message) {
        if ( message == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setSender( messageDTOToUserEntity( message ) );
        messageEntity.setReceiver( messageDTOToUserEntity1( message ) );
        messageEntity.setId( message.getId() );
        messageEntity.setContent( message.getContent() );
        messageEntity.setCreationDate( message.getCreationDate() );
        messageEntity.setRead( message.getRead() );

        return messageEntity;
    }

    private Long messageEntitySenderId(MessageEntity messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }
        UserEntity sender = messageEntity.getSender();
        if ( sender == null ) {
            return null;
        }
        Long id = sender.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long messageEntityReceiverId(MessageEntity messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }
        UserEntity receiver = messageEntity.getReceiver();
        if ( receiver == null ) {
            return null;
        }
        Long id = receiver.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UserEntity messageDTOToUserEntity(MessageDTO messageDTO) {
        if ( messageDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( messageDTO.getSenderId() );

        return userEntity;
    }

    protected UserEntity messageDTOToUserEntity1(MessageDTO messageDTO) {
        if ( messageDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( messageDTO.getReceiverId() );

        return userEntity;
    }
}
