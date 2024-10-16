package com.school.educcom.infrastructure.controllers;

import com.school.educcom.application.service.MessageService;
import com.school.educcom.domain.model.MessageDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/messages")
public class MessageController {

  private final MessageService messageService;
  
  @PostMapping("/send")
  public MessageDTO sendMessage(@RequestParam String content, @RequestParam Long receiverId, @RequestParam Long senderId) {
    return messageService.sendMessage(content, senderId, receiverId);
  }

  // Get received messages (both teachers and students)
  @GetMapping("/received")
  public List<MessageDTO> getReceivedMessages(Long userId) {
    return messageService.getReceivedMessages(userId);
  }

  @GetMapping("/sent")
  public List<MessageDTO> getSentMessages(Long userId) {
    return messageService.getSentMessages(userId);
  }
}