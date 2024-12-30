package com.kt.Task_api.entity;

import com.kt.Task_api.Enums.Priority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Priority priority;
    private Date deadline;
    private boolean completed;

    @ManyToOne()
    private Category category;
    @ManyToOne()
    private User user;

}
