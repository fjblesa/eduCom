package com.school.educcom.application.service;

import com.school.educcom.domain.model.MessageDTO;
import java.util.List;

public interface MessageService {
  MessageDTO sendMessage(String content, Long senderId, Long receiverId);

  // Get messages received by the user
  List<MessageDTO> getReceivedMessages(Long userId);

  // Get messages sent by the user
  List<MessageDTO> getSentMessages(Long userId);
}
