package com.school.educcom.infrastructure.persistence;

import com.school.educcom.domain.MessageRepository;
import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.infrastructure.persistence.entity.Message;
import com.school.educcom.infrastructure.persistence.jpa.JpaMessageRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DefaultMessageRepository implements MessageRepository {
  private final JpaMessageRepository jpaMessageRepository;

  @Override
  public MessageDTO save(MessageDTO message) {
    return messageToMessageDTO(
        jpaMessageRepository.save(messageDTOToMessage(message)));
  }

  @Override
  public List<MessageDTO> findByReceiverId(Long userId) {
    return messagesToMessagesDTO(jpaMessageRepository.findByReceiverId(userId));
  }

  @Override
  public List<MessageDTO> findBySenderId(Long userId) {
    return messagesToMessagesDTO(jpaMessageRepository.findBySenderId(userId));
  }

  private List<Message> messagesDTOToMessages(List<MessageDTO> messages) {
    return messages.stream().map(message ->
        new Message(message.getId(),message.getContent(),message.getCreationDate(),message.getRead())).collect(Collectors.toList());
  }

  private List<MessageDTO> messagesToMessagesDTO(List<Message> messages) {
    return messages.stream().map(message ->
        new MessageDTO(message.getId(),message.getContent(),message.getCreationDate(),message.getRead())).collect(Collectors.toList());
  }

  private MessageDTO messageToMessageDTO(Message message) {
    return new MessageDTO(message.getId(),message.getContent(),message.getCreationDate(),message.getRead());
  }

  private Message messageDTOToMessage(MessageDTO message) {
    return new Message(message.getId(),message.getContent(),message.getCreationDate(),message.getRead());
  }
}
