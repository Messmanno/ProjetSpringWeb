package com.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "personne")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "person_type")
public abstract class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = true)
    private String firstName;

    @Column(name = "last_name", nullable = true)
    private String lastName;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Column(name = "ville", nullable = true)
    private String ville;

    @Column(name = "year", nullable = true)
    private Date year;

    @Column(name = "genre", nullable = true)
    private Boolean genre;
}
