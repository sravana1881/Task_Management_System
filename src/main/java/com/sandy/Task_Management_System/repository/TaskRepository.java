package com.sandy.Task_Management_System.repository;

import com.sandy.Task_Management_System.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Optional<Task> getTasksById(long id);
}
