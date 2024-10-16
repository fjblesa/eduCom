package com.school.educcom.infrastructure.persistence.jpa;

import com.school.educcom.infrastructure.persistence.entity.MessageEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMessageRepository extends CrudRepository<MessageEntity, Long> {
  List<MessageEntity> findBySenderId(Long senderId);

  List<MessageEntity> findByReceiverId(Long receiverId);
}
