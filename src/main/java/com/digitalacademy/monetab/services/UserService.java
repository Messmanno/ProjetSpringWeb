package com.digitalacademy.monetab.services;

import com.digitalacademy.monetab.models.User;
import com.digitalacademy.monetab.services.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService  {



    UserDTO save(UserDTO userDTO);



    UserDTO update(UserDTO userDTO);


    Optional<UserDTO> findOne(Long id);

    List<UserDTO> findAll();

    void delete(long id);

}
