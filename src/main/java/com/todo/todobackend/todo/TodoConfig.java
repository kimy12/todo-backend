package com.todo.todobackend.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class TodoConfig {

    LocalDate date = LocalDate.now();

    @Bean
    CommandLineRunner commandLineRunner (TodoRepository repository){
        return args -> {
            Todo todo1 = new Todo(
                    "오늘 할일1",
                    date,
                    date,
                    "N",
                    "N"
            );

            Todo todo2 = new Todo(
                    "오늘 할일2",
                    date,
                    date,
                    "N",
                    "N"
            );

            repository.saveAll(
                    List.of(todo1,todo2)
            );
        };
    }
}
