package com.digitalacademy.monetab.controller;


import com.digitalacademy.monetab.models.Teacher;
import com.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeachersController {

    private final TeacherService teacherService;

    @GetMapping
    public String showTeachersPage(Model model){
        List<Teacher> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers/list";
    }

    @GetMapping("/add")
    public String showAddTeacherPage(Model model){
        model.addAttribute("teacher", new Teacher());
        return "teachers/forms";
    }

    @PostMapping
    public String saveTeacher(Teacher teacher){
        teacherService.save(teacher);
        return "redirect:/teachers";
    }


    @GetMapping("/{id}")
    public String showUpdateTeacherForms(Model model, @PathVariable Long id){
        Optional<Teacher> teacher = teacherService.findOne(id);
        if (teacher.isPresent()){
            model.addAttribute("teacher" , teacher.get());
            return "teachers/forms";
        } else {
            return "redirect:/teachers";
        }
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable Long id) {
        try {
            teacherService.delete(id); // Appelle la méthode de suppression dans le service
            return new ResponseEntity<>("Teacher deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting teacher", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
