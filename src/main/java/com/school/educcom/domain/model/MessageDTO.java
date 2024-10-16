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
  private LocalDateTime creationDate;
  private Boolean read;

  public MessageDTO(String content) {
    this.content = content;
  }
}
