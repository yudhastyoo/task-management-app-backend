package com.yudha.task_management_app.domain.repository;

import com.yudha.task_management_app.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
