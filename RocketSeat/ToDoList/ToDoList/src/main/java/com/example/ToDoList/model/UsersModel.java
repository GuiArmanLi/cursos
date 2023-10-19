package com.example.ToDoList.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "tUsers")
@Data
public class UsersModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;
    @Column(unique = true)
    private String userName;
    private String password;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
