package com.digitalacademy.monetab.repositories;

import com.digitalacademy.monetab.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositories extends JpaRepository<Student, Long> {

}
