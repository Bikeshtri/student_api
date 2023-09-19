package com.example.student.StudentData;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    public List<Student> getAllStudents();

    public Optional<Student> getStudent(String id);

    public void addStudent(Student student);

    public void updateStudent(String id, Student student);

    public void deleteStudent(String id);


}
