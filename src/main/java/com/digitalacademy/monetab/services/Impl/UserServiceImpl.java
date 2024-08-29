package com.digitalacademy.monetab.services.Impl;

import com.digitalacademy.monetab.models.User;
import com.digitalacademy.monetab.repositories.UserRepositories;
import com.digitalacademy.monetab.services.Mapper.UserMapper;
import com.digitalacademy.monetab.services.UserService;
import com.digitalacademy.monetab.services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//il faut toujours placer le log en premiere position dans nos methodes

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    //Injection de dependance
    private final UserRepositories userRepositories;
//    private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);



    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save User : {}", userDTO);
        User user = UserMapper.toEntity(userDTO);
       // Assurez-vous que ce champ est null et non persistant

        user = userRepositories.save(user);
        return UserMapper.toDto(user);
    }



    @Override
    public UserDTO update(UserDTO userDTO) {
       User user = UserMapper.toEntity(userDTO);
       user = userRepositories.save(user);
       return UserMapper.toDto(user);
    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepositories.findById(id).map(user -> {
            return UserMapper.toDto(user);
        });
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepositories.findAll().stream().map(user -> {
            return UserMapper.toDto(user);
        }).toList();
//        quand c'est list -> stream() pour avoir map()
//                sinon directement map()
    }

    @Override
    public void delete(long id) {
        log.debug("Request to delete user");
        userRepositories.deleteById(id);
    }
}
