package com.growthX.assignment_portal.repositories;

import com.growthX.assignment_portal.models.Assignment;
import com.growthX.assignment_portal.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AssignmentRepository extends MongoRepository<Assignment, String> {
    List<Assignment> findByAdminId(String adminId);
}