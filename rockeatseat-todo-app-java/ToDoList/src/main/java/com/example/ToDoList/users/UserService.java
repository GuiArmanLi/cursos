package com.example.ToDoList.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import at.favre.lib.crypto.bcrypt.BCrypt;

import com.example.ToDoList.errors.IncorrectLenghtAttributeException;
import com.example.ToDoList.utils.Utils;

@Service
public class UserService {
    @Autowired
    IUsers users;

    public ResponseEntity<Page<UserModel>> findAll() {
        var page = PageRequest.of(1, 10);
        var usersFound = users.findAll(page);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(usersFound);
    }

    public ResponseEntity<UserModel> findByUsername(String username) {
        var userFound = users.findByUsername(username);
        if (userFound.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(userFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    public ResponseEntity<UserModel> save(UserModel user) {
        var userFound = users.findByUsername(user.getUsername());
        if (!userFound.isPresent()) {

            if (user.getPassword().length() < 13 || user.getPassword().length() > 18) {
                try {
                    throw new IncorrectLenghtAttributeException(
                            "Password deve ser maior que 13 e menor que 18 caracteres");
                } catch (IncorrectLenghtAttributeException e) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
                }
            }

            String hashPassword = BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray());
            user.setPassword(hashPassword);
            users.save(user);

            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    public ResponseEntity<UserModel> upDate(String username, UserModel user) {
        var userFound = users.findByUsername(username);
        if (userFound.isPresent()) {
            Utils.copyNunNullProperties(user, userFound.get());
            users.save(userFound.get());

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(userFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    public ResponseEntity<UserModel> delete(String username) {
        var userFound = users.findByUsername(username);
        if (userFound.isPresent()) {
            users.delete(userFound.get());

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(userFound.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
