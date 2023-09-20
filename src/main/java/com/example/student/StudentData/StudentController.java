package com.example.student.StudentData;

import io.swagger.annotations.ApiOperation;
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
        @ApiOperation("Fetches all the students")
        public List<Student> getAllTopics() {
            return studentService.getAllStudents();
        }

        @RequestMapping("/students/{id}")
        @ApiOperation("Fetches student based on ID")
        public Optional<Student> getTopic(@PathVariable String id) {
            return studentService.getStudent(id);
        }

        @RequestMapping(method = RequestMethod.POST, value = "/student")
        @ApiOperation("Adds student to list")
        public void addTopic(@RequestBody Student student){
            studentService.addStudent(student);
        }

        @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
        @ApiOperation("Updates specific student details")
        public void updateTopic(@RequestBody Student student, @PathVariable String id){
            studentService.updateStudent(id, student);
        }

        @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
        @ApiOperation("Deletes student from list")
        public void deleteTopic(@PathVariable String id){
            studentService.deleteStudent(id);
        }
    }
