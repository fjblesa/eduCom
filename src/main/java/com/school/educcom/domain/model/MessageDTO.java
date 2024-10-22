package com.school.educcom.domain.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
  private Long id;
  private String content;
  private Long senderId;
  private Long receiverId;
  private String receiverName;
  private String senderName;
  private LocalDateTime creationDate;
  private Boolean read;

  public MessageDTO(String content, Long senderId, Long receiverId, String receiverName, String senderName) {
    this.content = content;
    this.senderId = senderId;
    this.receiverId = receiverId;
    this.receiverName = receiverName;
    this.senderName = senderName;
  }
}
