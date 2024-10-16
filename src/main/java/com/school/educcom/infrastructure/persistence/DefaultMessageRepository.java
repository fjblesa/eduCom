package com.school.educcom.infrastructure.persistence;

import com.school.educcom.domain.MessageRepository;
import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.infrastructure.persistence.jpa.JpaMessageRepository;
import com.school.educcom.infrastructure.persistence.mapper.MessageMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DefaultMessageRepository implements MessageRepository {

  private final MessageMapper messageMapper;
  private final JpaMessageRepository jpaMessageRepository;

  @Override
  public MessageDTO save(MessageDTO message) {
    return messageMapper.messageToMessageDTO(
        jpaMessageRepository.save(
            messageMapper.messageDTOToMessage(message)));
  }

//  @Override
//  public List<MessageDTO> findByReceiverId(Long userId) {
//    return messagesToMessagesDTO(jpaMessageRepository.findByReceiverId(userId));
//  }

//  @Override
//  public List<MessageDTO> findBySenderId(Long userId) {
//    return messagesToMessagesDTO(jpaMessageRepository.findBySenderId(userId));
//  }
}
