package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.infrastructure.persistence.entity.MessageEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    @Mapping(target = "senderId", source = "sender.id")
    @Mapping(target = "receiverId", source = "receiver.id")
    MessageDTO messageToMessageDTO(MessageEntity messageEntity);

    List<MessageDTO> messagesToMessagesDTO(List<MessageEntity> messageEntities);

    @Mapping(target = "sender.id", source = "senderId")
    @Mapping(target = "receiver.id", source = "receiverId")
    MessageEntity messageDTOToMessage(MessageDTO message);
}
