package com.todo.todobackend.todo;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todo", schema = "local_todo")
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {

    @Id
    @SequenceGenerator(
            name = "content_seq",
            sequenceName = "content_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "content_seq"
    )

    private Long id;
    private String item;
    private LocalDate startDate;
    private LocalDate updateDate;
    private String isCompleted;
    private String isDeleted;
    @Transient
    private String isEditing;

    public Todo(String item, LocalDate startDate, LocalDate updateDate, String isCompleted, String isDeleted){
        this.item = item;
        this.startDate = startDate;
        this.updateDate = updateDate;
        this.isCompleted = isCompleted;
        this.isDeleted = isDeleted;
    }

}
