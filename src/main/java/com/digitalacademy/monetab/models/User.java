package com.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "user")
public class User extends Personne {

    @Column(unique = true, nullable = false)
    private String pseudo;

    @Column(nullable = false)
    private String password;


    @Column(nullable = true)
    private Instant creationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;  // La propriété doit correspondre à la relation définie dans Adresse
}
