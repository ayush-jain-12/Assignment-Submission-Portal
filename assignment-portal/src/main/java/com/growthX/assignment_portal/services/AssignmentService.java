package com.growthX.assignment_portal.services;

import com.growthX.assignment_portal.models.Assignment;
import com.growthX.assignment_portal.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment uploadAssignment(Assignment assignment) {
        assignment.setTimestamp(LocalDateTime.now());
        assignment.setStatus("PENDING");
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAssignmentsByAdminId(String adminId) {
        return assignmentRepository.findByAdminId(adminId);
    }

    public Assignment updateAssignmentStatus(String id, String status) {
        Assignment assignment = assignmentRepository.findById(id).orElse(null);
        if (assignment != null) {
            assignment.setStatus(status);
            return assignmentRepository.save(assignment);
        }
        return null;
    }
}

