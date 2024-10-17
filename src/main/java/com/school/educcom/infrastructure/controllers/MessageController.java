package com.school.educcom.infrastructure.controllers;

import com.school.educcom.application.service.MessageService;
import com.school.educcom.domain.model.MessageDTO;
import com.school.educcom.domain.model.SendRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/messages")
@Tag(
    name = "Messages controller",
    description = "This controller its to send messages and' get received or sent messages ")
public class MessageController {

  private final MessageService messageService;

  @PostMapping("/send")
  public MessageDTO sendMessage(@RequestBody SendRequest message) {
    return messageService.sendMessage(message);
  }

  // Get received messages (both teachers and students)
  @GetMapping("/received")
  public List<MessageDTO> getReceivedMessages(@RequestParam Long userId) {
    return messageService.getReceivedMessages(userId);
  }

  @GetMapping("/sent")
  public List<MessageDTO> getSentMessages(@RequestParam Long userId) {
    return messageService.getSentMessages(userId);
  }
}
