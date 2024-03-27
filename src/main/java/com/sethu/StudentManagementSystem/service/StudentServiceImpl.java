package com.sethu.StudentManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethu.StudentManagementSystem.entity.Student;
import com.sethu.StudentManagementSystem.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
   
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}
}
