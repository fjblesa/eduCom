package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.infrastructure.persistence.entity.MessageEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T11:24:59+0200",
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

        messageEntity.setId( message.getId() );
        messageEntity.setContent( message.getContent() );
        messageEntity.setCreationDate( message.getCreationDate() );
        messageEntity.setRead( message.getRead() );

        return messageEntity;
    }
}
