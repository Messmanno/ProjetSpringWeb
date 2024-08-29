package com.digitalacademy.monetab.services.Impl;

import com.digitalacademy.monetab.models.Student;
import com.digitalacademy.monetab.models.User;
import com.digitalacademy.monetab.repositories.StudentRepositories;
import com.digitalacademy.monetab.services.Mapper.StudentMapper;
import com.digitalacademy.monetab.services.Mapper.UserMapper;
import com.digitalacademy.monetab.services.StudentService;
import com.digitalacademy.monetab.services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import com.digitalacademy.monetab.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepositories studentRepositories;



    public StudentDTO save(StudentDTO studentDTO) {

        Student student = StudentMapper.toEntity(studentDTO);
        // Assurez-vous que ce champ est null et non persistant

        student = studentRepositories.save(student);
        return StudentMapper.toDTO(student);
    }




    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        Student student = StudentMapper.toEntity(studentDTO);
        student = studentRepositories.save(student);
        return StudentMapper.toDTO(student);
    }


    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return studentRepositories.findById(id).map(student -> {
            return StudentMapper.toDTO(student);
        });
    }



    @Override
    public List<StudentDTO> findAll() {
        return studentRepositories.findAll().stream().map(student -> {
            return StudentMapper.toDTO(student);
        }).toList();
//        quand c'est list -> stream() pour avoir map()
//                sinon directement map()
    }

    @Override
    public void delete(Long id) {
        studentRepositories.deleteById(id);
    }
}
