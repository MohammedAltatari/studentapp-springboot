package com.mohammed.studentapp.repositories;

import com.mohammed.studentapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}