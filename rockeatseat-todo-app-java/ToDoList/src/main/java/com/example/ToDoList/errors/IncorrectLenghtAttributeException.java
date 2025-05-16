package com.example.ToDoList.errors;

import java.util.logging.Logger;

public class IncorrectLenghtAttributeException extends Exception {
    public IncorrectLenghtAttributeException(String message) {
        Logger.getLogger("Error").warning(message);
    }

}
