package com.school.educcom.application.service;

import com.school.educcom.domain.MessageRepository;
import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.domain.model.SendRequest;
import com.school.educcom.domain.model.UserDTO;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DefaultMessageService implements MessageService{

  private final UserService userService;
  private final MessageRepository messageRepository;

  @Override
  public MessageDTO sendMessage(SendRequest message) {
    UserDTO sender = userService.findById(message.getSenderId());
    UserDTO receiver = userService.findById(message.getReceiverId());
    if(sender == null || receiver == null){
      throw new RuntimeException("Receiver or Sender not Found");
    }

    MessageDTO messageDTO =
        new MessageDTO(message.getContent(), sender.getId(), receiver.getId(),message.getReceiverName(), message.getSenderName());
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
