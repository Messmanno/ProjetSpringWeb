package com.digitalacademy.monetab.services.Mapper;


import com.digitalacademy.monetab.models.Student;
import com.digitalacademy.monetab.dto.StudentDTO;

public class StudentMapper {

    // Convertir l'entité Student en StudentDTO
    public static StudentDTO toDTO(Student student) {
        if (student == null) {
            return null;
        }
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setPhone(student.getPhone());
        dto.setVille(student.getVille());
        dto.setYear(student.getYear());
        dto.setGenre(student.getGenre());
        dto.setMatricule(student.getMatricule());
        dto.setClasse(student.getClasse());
        return dto;
    }

    // Convertir StudentDTO en entité Student
    public static Student toEntity(StudentDTO studentDTO) {
        if (studentDTO == null) {
            return null;
        }
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setPhone(studentDTO.getPhone());
        student.setVille(studentDTO.getVille());
        student.setYear(studentDTO.getYear());
        student.setGenre(studentDTO.getGenre());
        student.setMatricule(studentDTO.getMatricule());
        student.setClasse(studentDTO.getClasse());
        return student;
    }
}
