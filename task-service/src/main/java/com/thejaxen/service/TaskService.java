package com.thejaxen.service;

import com.thejaxen.modal.Task;
import com.thejaxen.modal.TaskStatus;

import java.util.List;

public interface TaskService {

    Task createTask(Task task, String requesterRole)throws Exception;

    Task getTaskById(Long id)throws Exception;

    List<Task> getAllTasks(TaskStatus status);

    Task updateTask(Long id, Task updatedTask,Long userId)throws Exception;

    void deleteTask(Long id) throws Exception;

    Task assignedToUser(Long userId, Long taskId)throws Exception;

    List<Task> assignedUsersTasks(Long userId, TaskStatus status);

    Task completeTask(Long taskId) throws Exception;
}
