package com.thejaxen.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private String image;

    private Long assignedUserId;

    private List<String> tags = new ArrayList<String>();

    private TaskStatus status;

    private LocalDateTime deadline;

    private LocalDateTime createdAt;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAssignedUserId(Long assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getImage() {
        return image;
    }
    public Long getAssignedUserId() {
        return assignedUserId;
    }

    public List<String> getTags() {
        return tags;
    }
    public TaskStatus getStatus() {
        return status;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
