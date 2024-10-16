package com.school.educcom.domain.model;

import com.school.educcom.domain.enums.Role;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private Long id;
  
  private String userName;

  private String name;

  private String surName;

  private String surName2;

  private String password;

  private Role role; // Enum for role (STUDENT or TEACHER)
}
