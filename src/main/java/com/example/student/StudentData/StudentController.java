package com.example.student.StudentData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

        @Autowired
        private StudentService studentService;

        @RequestMapping("/students")
        public List<Student> getAllTopics() {
            return studentService.getAllStudents();
        }

        @RequestMapping("/students/{id}")
        public Optional<Student> getTopic(@PathVariable String id) {
            return studentService.getStudent(id);
        }

        @RequestMapping(method = RequestMethod.POST, value = "/student")
        public void addTopic(@RequestBody Student student){
            studentService.addStudent(student);
        }

        @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
        public void updateTopic(@RequestBody Student student, @PathVariable String id){
            studentService.updateStudent(id, student);
        }

        @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
        public void deleteTopic(@PathVariable String id){
            studentService.deleteStudent(id);
        }
    }

//
//    git init
//    git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/ushareddyr/student_api.git
//        git push -u origin main