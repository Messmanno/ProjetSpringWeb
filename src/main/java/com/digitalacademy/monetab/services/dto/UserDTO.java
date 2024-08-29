package com.digitalacademy.monetab.services.dto;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.Instant;


import java.time.Instant;

@Getter
@Setter


public class UserDTO {
    private Long id;
    private String pseudo;
    private String password;
    private String confirmpassword; // Champ uniquement pour validation
    private Instant creationDate;


}


