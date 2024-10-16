package com.school.educcom.infrastructure.persistence.jpa;

import com.school.educcom.infrastructure.persistence.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSubjectRepository extends CrudRepository<Subject, Long> {}
