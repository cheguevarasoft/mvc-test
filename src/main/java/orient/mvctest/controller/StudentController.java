package orient.mvctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import orient.mvctest.entity.School;
import orient.mvctest.entity.Student;
import orient.mvctest.respository.StudentRepository;

import java.awt.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/school/students")
    public List<Student> getStudent(){

        return  studentRepository.findAll();
    }

    @GetMapping(value = "/school/students/{id}")
    public Student getStudentById(@PathVariable Long id){

        Student data = new Student();
        Student  data1 = studentRepository.getById(id);
        data.setId(data1.getId());
        data.setFirstName(data1.getFirstName());
        data.setLastName(data1.getLastName());
        data.setEmail(data1.getEmail());

        return data;
    }

    @GetMapping("/school")
    public School getSchool(){

        List<Student> students = studentRepository.findAll();
        School sc = new School();
        sc.setName("Azerbaycan Texniki Universiteti");
        sc.setStudents(students);

        return sc;
    }



}
