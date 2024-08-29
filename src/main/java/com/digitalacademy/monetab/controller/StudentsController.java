package com.digitalacademy.monetab.controller;


import com.digitalacademy.monetab.models.Student;
import com.digitalacademy.monetab.models.Teacher;
import com.digitalacademy.monetab.services.StudentService;
import com.digitalacademy.monetab.services.dto.UserDTO;
import lombok.AllArgsConstructor;
import com.digitalacademy.monetab.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
@Slf4j
public class StudentsController {
    private final StudentService studentService;

    @GetMapping()
    public String showStudentPage(Model model)
    {
        model.addAttribute("students", studentService.findAll());
        return "students/list";
    }



    @GetMapping("/add")
    public String showAddStudentPage(Model model) {
        model.addAttribute("student", new Student());
        return "students/forms";
    }


    @PostMapping
    public String saveStudent(StudentDTO studentDTO) {
        studentService.save(studentDTO);
        return "redirect:/students";
    }


    @GetMapping("/{id}")
    public String showUpdateStudentForm(@PathVariable Long id, Model model) {
        Optional<StudentDTO> studentDTO = studentService.findOne(id);
        if(studentDTO.isPresent()) {
            model.addAttribute("student", studentDTO.get());
            return "students/forms";
        }else{
            return "redirect:/students";
        }
    }


    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        try {
            studentService.delete(id); // Appelle la méthode de suppression dans le service
            return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting student", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }









}
