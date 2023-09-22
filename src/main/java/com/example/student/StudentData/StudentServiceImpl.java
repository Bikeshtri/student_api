package com.example.student.StudentData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    public List<Student> getAllStudents() {
        List<Student> topics= new ArrayList<>();
        studentRepository.findAll()
                .forEach(topics::add);
        LOGGER.info("Students list fetched");
        return topics;
    }

    public Optional<Student> getStudent(String id) {
        LOGGER.info("Student is fetched");
        return studentRepository.findById(id);
    }

    public void addStudent(Student student){
        LOGGER.info("Student is added");
        studentRepository.save(student);
    }

    public void updateStudent(String id, Student student){
        LOGGER.info("Student is upadted");
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        LOGGER.info("Student is deleted");
        studentRepository.deleteById(id);
    }
}
