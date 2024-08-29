package com.digitalacademy.monetab.services.Impl;

import com.digitalacademy.monetab.models.Teacher;
import com.digitalacademy.monetab.repositories.TeacherRepositories;
import com.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private final TeacherRepositories teacherRepositories;


    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepositories.save(teacher);
    }


    @Override
    public Teacher update(Teacher teacher) {
        Optional<Teacher> optionalTeacher = findOne(teacher.getId()); //Recup d'un Optional<User>
        if(optionalTeacher.isPresent()){ //verification du contenu
            Teacher updatedTeacher = optionalTeacher.get();
            updatedTeacher.setMatiere(teacher.getMatiere());
            return save(updatedTeacher); //Enregistrement du user modifié
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<Teacher> findOne(long id) {
        return teacherRepositories.findById(id);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepositories.findAll();
    }

    @Override
    public void delete(long id) {
        teacherRepositories.deleteById(id);
    }

    @Override
    public String toString() {
        return "TeacherServiceImpl{" +
                "teacherRepositories=" + teacherRepositories +
                '}';
    }
}
