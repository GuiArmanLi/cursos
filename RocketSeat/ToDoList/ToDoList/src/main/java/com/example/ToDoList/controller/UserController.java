package com.example.ToDoList.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.example.ToDoList.model.UsersModel;
import com.example.ToDoList.repository.IUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUsers userDB;
    @GetMapping
    public ResponseEntity getUsers (){
        return ResponseEntity.status(HttpStatus.OK).body(this.userDB.findAll());
    }

    @PostMapping
    public ResponseEntity create (@RequestBody UsersModel user) {
        var userName = this.userDB.findByUserName(user.getUserName());

        if (userName != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Aqui");
        }
        var hashPassword = BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray());
        user.setPassword(hashPassword);
        this.userDB.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
