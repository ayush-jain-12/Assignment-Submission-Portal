package com.growthX.assignment_portal.controllers;

import com.growthX.assignment_portal.models.Assignment;
import com.growthX.assignment_portal.models.User;
import com.growthX.assignment_portal.services.AssignmentService;
import com.growthX.assignment_portal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    @PostMapping("/upload")
    public ResponseEntity<Assignment> uploadAssignment(@RequestBody Assignment assignment) {
        return ResponseEntity.ok(assignmentService.uploadAssignment(assignment));
    }
}