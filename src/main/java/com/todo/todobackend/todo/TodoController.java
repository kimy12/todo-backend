package com.todo.todobackend.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping(path = "api/v1")
public class TodoController {
    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {this.todoService = todoService;}

    @GetMapping(path = "/todo")
    public void getTodos(Model model) {

        List<Todo> todoList = todoService.getTodos();

        model.addAttribute("itemList", todoList);

    }
}
