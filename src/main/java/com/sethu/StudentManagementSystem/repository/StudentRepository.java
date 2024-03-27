package com.sethu.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethu.StudentManagementSystem.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
