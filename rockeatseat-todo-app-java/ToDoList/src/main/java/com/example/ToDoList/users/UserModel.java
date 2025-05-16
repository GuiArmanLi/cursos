package com.example.ToDoList.users;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.example.ToDoList.errors.IncorrectLenghtAttributeException;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.UUID;
import lombok.Data;

@Entity(name = "users")
@Data
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(nullable = true)
    private String name;

    @NotNull
    @Length(min = 4, max = 12)
    @Column(unique = true, nullable = false)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;

    @NotNull
    @Column(nullable = false)
    private boolean isMessageEnable;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setUsername(String username) throws IncorrectLenghtAttributeException {
        if (username.length() < 4 || username.length() > 12) {
            throw new IncorrectLenghtAttributeException("Username deve ser maior que 4 e menor que 12 caracteres");
        }
        this.username = username;
    }

}
