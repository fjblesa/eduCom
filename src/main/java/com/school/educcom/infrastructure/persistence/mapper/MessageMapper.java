package com.school.educcom.infrastructure.persistence.mapper;

import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.infrastructure.persistence.entity.MessageEntity;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
  MessageDTO messageToMessageDTO (MessageEntity messageEntity);

  List<MessageDTO> messagesToMessagesDTO (List<MessageEntity> messageEntities);

  MessageEntity messageDTOToMessage (MessageDTO message);
}
