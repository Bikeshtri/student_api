package com.example.student.StudentData;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

        @Autowired
        private StudentService studentService;
        
        @GetMapping("/students")
        @ApiOperation("Fetches all the students")
        public List<Student> getAllStudents() {
            return studentService.getAllStudents();
        }

        @GetMapping("/students/{id}")
        @ApiOperation("Fetches student based on ID")
        public Optional<Student> getStudent(@PathVariable String id) {
            return studentService.getStudent(id);
        }

        @PostMapping(value = "/student")
        @ApiOperation("Adds student to list")
        public void addStudent(@RequestBody Student student){
            studentService.addStudent(student);
        }

        @PutMapping(value = "/students/{id}")
        @ApiOperation("Updates specific student details")
        public void updateStudent(@RequestBody Student student, @PathVariable String id){
            studentService.updateStudent(id, student);
        }

        @DeleteMapping(value = "/students/{id}")
        @ApiOperation("Deletes student from list")
        public void deleteStudent(@PathVariable String id){
            studentService.deleteStudent(id);
        }
    }
