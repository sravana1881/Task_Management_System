package com.sandy.Task_Management_System.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="taskid",unique = true, nullable = false)
    int id;
    @Column(name="task_title")
    String name;
    @Column(name="task_description")
    String description;
    @Column(name="status")
    String status;

}
