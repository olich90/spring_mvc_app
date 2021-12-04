package ru.gb.service;

import org.springframework.stereotype.Service;
import ru.gb.dto.Student;
import ru.gb.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
  // внедрение studentRepository в StudentService
  private StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> getAll() {
    return studentRepository.getAll();
  }

  public void save(Student student) {
    studentRepository.save(student);
  }

  public Student findById(int id) {
    return studentRepository.findById(id);
  }
}
