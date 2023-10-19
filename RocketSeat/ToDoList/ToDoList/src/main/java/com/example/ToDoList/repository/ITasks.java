package com.example.ToDoList.repository;

import com.example.ToDoList.model.TasksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ITasks extends JpaRepository<TasksModel, UUID> {
    TasksModel findByTitle(String title);

    TasksModel findByIdUser (UUID idUser);
}
