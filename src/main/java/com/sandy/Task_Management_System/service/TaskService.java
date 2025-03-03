package com.sandy.Task_Management_System.service;

import com.sandy.Task_Management_System.model.Task;
import com.sandy.Task_Management_System.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.getTasksById(id);
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void deleteTaskById( Long id) {
         taskRepository.deleteById(id);
    }

    public Task updateTask(Long id,Task updatedTask) {
        return taskRepository.findById(id)
                .map(task -> {
             task.setTitle(updatedTask.getTitle());
             task.setDescription(updatedTask.getDescription());
             task.setStatus(updatedTask.getStatus());
            return taskRepository.save(task);
        })
                .orElseThrow(() -> new RuntimeException("Task not found"));

        }
    }

