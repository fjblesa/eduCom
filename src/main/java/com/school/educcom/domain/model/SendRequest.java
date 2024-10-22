package com.school.educcom.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SendRequest {
  private String content;
  private Long receiverId;
  private String receiverName;
  private Long senderId;
  private String senderName;
}
