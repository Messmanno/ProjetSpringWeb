package com.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

//pour l'heritage
@DiscriminatorValue(value = "student" )
public class Student extends Personne {



    @Column(unique = true, nullable = false)
    private String matricule;

    @Column(name = "classe" , nullable = true)
    private String classe;



}








