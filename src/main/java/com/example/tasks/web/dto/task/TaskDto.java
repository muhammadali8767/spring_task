package com.example.tasks.web.dto.task;

import com.example.tasks.domain.task.Status;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;
}
