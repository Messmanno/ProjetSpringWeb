package com.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

//pour l'heritage
@DiscriminatorValue(value = "teacher")
public class Teacher extends Personne{
   //id matiere




    @Column(unique = true, nullable = false)
    private String matiere;
                                //EAGER



}




