package com.example.ToDoList.tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;
import java.util.UUID;

@Repository
public interface ITask extends JpaRepository<TaskModel, UUID> {
    @Query(value = "SELECT * FROM tasks WHERE describe IS NOT NULL",  nativeQuery = true)
    Optional<List<TaskModel>> findAllByIdUser(UUID idUser);

    Optional<TaskModel> findByTitle(String title);
}
