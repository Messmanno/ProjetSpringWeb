package com.digitalacademy.monetab.services;

import com.digitalacademy.monetab.models.Student;
import com.digitalacademy.monetab.models.Teacher;
import com.digitalacademy.monetab.dto.StudentDTO;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    //save update findOne fineAll delete

    StudentDTO save(StudentDTO studentDTO);

    StudentDTO update(StudentDTO studentDTO);

    Optional<StudentDTO> findOne(Long id);

    List<StudentDTO> findAll();

    void delete(Long id);

}
