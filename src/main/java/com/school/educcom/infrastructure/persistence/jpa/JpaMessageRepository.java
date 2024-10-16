package com.school.educcom.infrastructure.persistence.jpa;

import com.school.educcom.infrastructure.persistence.entity.Message;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMessageRepository extends CrudRepository<Message, Long> {
//  List<Message> findBySenderId(Long senderId);

//  List<Message> findByReceiverId(Long receiverId);
}
