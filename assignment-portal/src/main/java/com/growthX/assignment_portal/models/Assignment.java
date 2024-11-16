package com.growthX.assignment_portal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "assignments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {
    @Id
    private String id;
    private String userId;
    private String task;
    private String adminId;
    private String status; // "PENDING", "ACCEPTED", "REJECTED"
    private LocalDateTime timestamp;
}
