package com.example.ToDoList.controller;

import com.example.ToDoList.model.TasksModel;
import com.example.ToDoList.repository.ITasks;
import com.example.ToDoList.utils.Utils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    ITasks tasksDB;
    @GetMapping
    public ResponseEntity getAll (HttpServletRequest request) {
        var idUser = request.getAttribute("idUser");
        var tasks = this.tasksDB.findByIdUser((UUID)idUser);

        return ResponseEntity.status(HttpStatus.OK).body(tasks);
    }
    @PostMapping
    public ResponseEntity create (@RequestBody TasksModel taskModel, HttpServletRequest request) {
        var title = this.tasksDB.findByTitle(taskModel.getTitle());

        var idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID) idUser);

        var currentDate = LocalDateTime.now();

        if (title != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A tarefa já existe!");
        }

        if (taskModel.getStartAt().isAfter(taskModel.getEndAt())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Inicio deve ser antes do Final!");
        }

        if (taskModel.getStartAt().isBefore(currentDate) || taskModel.getEndAt().isBefore(currentDate)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Inicio deve ser maior que o momento atual!");
        }

        var task = this.tasksDB.save(taskModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @PutMapping("/{idTask}")
    public TasksModel upDate (@RequestBody TasksModel tasksModel, @PathVariable UUID idTask, HttpServletRequest request) {
        var task = this.tasksDB.findByIdUser(idTask);

        Utils.copyNunNullProperties(tasksModel, task);
        return this.tasksDB.save(task);
    }
}
