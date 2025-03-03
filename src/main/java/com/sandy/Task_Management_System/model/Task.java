package com.sandy.Task_Management_System.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",unique = true, nullable = false)
    long id;
    @Column(name="title")
    String title;
    @Column(name="description")
    String description;
    @Column(name="status")
    String status;
}
