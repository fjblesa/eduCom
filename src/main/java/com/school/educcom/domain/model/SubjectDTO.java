package com.school.educcom.domain.model;

import jakarta.persistence.Entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {
  private Long id;
  private String name;
  private List<UserDTO> users;
}
