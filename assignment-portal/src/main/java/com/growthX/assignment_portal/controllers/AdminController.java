package com.growthX.assignment_portal.controllers;

import com.growthX.assignment_portal.models.Assignment;
import com.growthX.assignment_portal.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/assignments")
    public ResponseEntity<List<Assignment>> getAssignments(@RequestParam String adminId) {
        return ResponseEntity.ok(assignmentService.getAssignmentsByAdminId(adminId));
    }

    @PostMapping("/assignments/{id}/accept")
    public ResponseEntity<Assignment> acceptAssignment(@PathVariable String id) {
        return ResponseEntity.ok(assignmentService.updateAssignmentStatus(id, "ACCEPTED"));
    }

    @PostMapping("/assignments/{id}/reject")
    public ResponseEntity<Assignment> rejectAssignment(@PathVariable String id) {
        return ResponseEntity.ok(assignmentService.updateAssignmentStatus(id, "REJECTED"));
    }
}
