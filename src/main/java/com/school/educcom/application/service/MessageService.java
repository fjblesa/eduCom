package com.school.educcom.application.service;

import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.domain.model.SendRequest;
import java.util.List;

public interface MessageService {
  // Get messages received by the user
  List<MessageDTO> getReceivedMessages(Long userId);

  // Get messages sent by the user
  List<MessageDTO> getSentMessages(Long userId);

  MessageDTO sendMessage(SendRequest message);
}
