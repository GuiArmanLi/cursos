package com.example.ToDoList.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import jakarta.servlet.http.HttpServletRequest;

import com.example.ToDoList.utils.Utils;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    ITask tasks;

    public ResponseEntity<List<TaskModel>> findAll(HttpServletRequest request) {
        UUID idUser = (UUID) request.getAttribute("idUser");

        var tasksFound = tasks.findAllByIdUser(idUser);
        if (tasksFound.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(tasksFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    public ResponseEntity<TaskModel> findByTitle(String title) {
        var taskFound = tasks.findByTitle(title);
        if (taskFound.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(taskFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    public ResponseEntity<TaskModel> save(TaskModel task, HttpServletRequest request) {
        var taskFound = tasks.findByTitle(task.getTitle());
        if (taskFound.isPresent()) {
            Logger.getLogger("Error").info("Tarefa já existe!");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        if (task.getStartAt().isAfter(task.getEndAt())) {
            Logger.getLogger("Erro").info("Inicio depois do Fim!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        LocalDateTime currentDate = LocalDateTime.now();
        if (task.getStartAt().isBefore(currentDate) || task.getEndAt().isBefore(currentDate)) {
            Logger.getLogger("Error").info("Inicio deve ser maior que agora!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        UUID idUser = (UUID) request.getAttribute("idUser");
        task.setIdUser(idUser);

        tasks.save(task);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(task);
    }

    public ResponseEntity<TaskModel> upDate(TaskModel task, String title) {
        var taskFound = tasks.findByTitle(title);
        if (taskFound.isPresent()) {
            Utils.copyNunNullProperties(task, taskFound.get());
            tasks.save(taskFound.get());

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(taskFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    public ResponseEntity<TaskModel> delete(String title) {
        var taskFound = tasks.findByTitle(title);
        if (taskFound.isPresent()) {
            tasks.delete(taskFound.get());

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(taskFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
