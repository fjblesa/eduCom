package com.school.educcom.domain;

import com.school.educcom.domain.model.MessageDTO;
import java.util.List;

public interface MessageRepository {

  MessageDTO save(MessageDTO message);

//  List<MessageDTO> findByReceiverId(Long userId);

//  List<MessageDTO> findBySenderId(Long userId);
}
