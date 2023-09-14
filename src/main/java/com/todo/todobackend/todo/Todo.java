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
    private String cont;
    private LocalDate dt;
    private String delYn;
    @Transient
    private String editYn;

}
