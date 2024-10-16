package com.school.educcom.infrastructure.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.school.educcom.domain.enums.Role;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username", nullable = false, unique = true)
  private String userName;

  @Column(nullable = false)
  private String name;

  @Column(name = "surname", nullable = false)
  private String surName;

  @Column(name = "surname2")
  private String surName2;

  @Column(nullable = false)
  private String password;

  @Enumerated(EnumType.STRING)
  private Role role;

  @ManyToMany
  @JoinTable(
      name = "user_subjects",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "subject_id"))
  private List<SubjectEntity> subjects = new ArrayList<>();

  @OneToMany
  private List<MessageEntity> sentMessages = new ArrayList<>();

  @OneToMany
  private List<MessageEntity> receivedMessages = new ArrayList<>();
}