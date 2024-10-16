package com.school.educcom.infrastructure.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

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

//  @Enumerated(EnumType.STRING)
//  private Role role;

//  @ManyToMany
//  @JoinTable(
//      name = "user_subjects",
//      joinColumns = @JoinColumn(name = "user_id"),
//      inverseJoinColumns = @JoinColumn(name = "subject_id"))
//  private List<Subject> subjects = new ArrayList<>();
//
//  @OneToMany
//  private List<Message> sentMessages = new ArrayList<>();
//
//  @OneToMany
//  private List<Message> receivedMessages = new ArrayList<>();
}