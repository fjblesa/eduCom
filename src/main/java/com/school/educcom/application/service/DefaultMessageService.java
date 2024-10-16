package com.school.educcom.application.service;

import com.school.educcom.domain.MessageRepository;
import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.domain.model.UserDTO;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DefaultMessageService implements MessageService{

  private final UserService userService;
  private final MessageRepository messageRepository;

  @Override
  public MessageDTO sendMessage(String content, Long senderId, Long receiverId) {
    UserDTO sender = userService.findById(senderId);
    UserDTO receiver = userService.findById(receiverId);

    MessageDTO messageDTO =
        new MessageDTO(content);
    return messageRepository.save(messageDTO);
  }

  // Get messages received by the user
  @Override
  public List<MessageDTO> getReceivedMessages(Long userId) {
    return messageRepository.findByReceiverId(userId);
  }

  // Get messages sent by the user
  @Override
  public List<MessageDTO> getSentMessages(Long userId) {
    return messageRepository.findBySenderId(userId);
  }
}
