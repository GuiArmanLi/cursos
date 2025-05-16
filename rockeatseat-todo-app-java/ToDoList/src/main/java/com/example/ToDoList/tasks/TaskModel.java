package com.example.ToDoList.tasks;

import com.example.ToDoList.errors.IncorrectLenghtAttributeException;
import org.springframework.hateoas.RepresentationModel;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.UUID;

@Entity(name = "tasks")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class TaskModel extends RepresentationModel<TaskModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(nullable = true)
    private UUID idUser;

    @NotNull
    @Length(min = 2, max = 50)
    @Column(nullable = false)
    private String title;

    @Length(max = 1000)
    @Column(nullable = true)
    private String describe;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime startAt;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime endAt;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws IncorrectLenghtAttributeException {
        if (title.length() > 50) {
            throw new IncorrectLenghtAttributeException("Titulo deve ser menor que 50 caracteres");
        }
        this.title = title;
    }

    public void setDescribe(String describe) throws IncorrectLenghtAttributeException {
        if (describe.length() > 1000) {
            throw new IncorrectLenghtAttributeException("descricao deve ser menor que 1000 caracteres");
        }
        this.title = describe;
    }

}
