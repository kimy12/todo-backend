package com.todo.todobackend.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query(value = "SELECT s FROM todo s where s.id =?1", nativeQuery = true)
    Optional<Todo> findTodoById(Long id);

}
