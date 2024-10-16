package com.school.educcom.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "message")
@NoArgsConstructor
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String content;

//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "sender_id", nullable = false)
//  private User sender;
//
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "receiver_id", nullable = false)
//  private User receiver;

  @Column(name = "creation_date", nullable = false)
  private LocalDateTime creationDate;

  @Column(nullable = false)
  private Boolean read;

  @PrePersist
  public void setDefaults() {
    this.read = Boolean.FALSE;
    this.creationDate = LocalDateTime.now();
  }
}
