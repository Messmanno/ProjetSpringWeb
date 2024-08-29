package com.digitalacademy.monetab.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class StudentDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String ville;
    private Date year;
    private Boolean genre;

    private String matricule;
    private String classe;

    // Constructors





}
