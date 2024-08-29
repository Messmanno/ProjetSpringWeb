package com.digitalacademy.monetab.controller;

import com.digitalacademy.monetab.models.Teacher;
import com.digitalacademy.monetab.models.User;
import com.digitalacademy.monetab.services.UserService;
import com.digitalacademy.monetab.services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UserService userService;

    @GetMapping
    public String showUserPage(Model model){
        model.addAttribute("users", userService.findAll());
        return "users/list";
    }

    @GetMapping("/add")
    public String showAddUserPage(Model model) {
       model.addAttribute("user", new User());
        return "users/forms";
    }



    @PostMapping
    public String saveUser(UserDTO userDTO){
        userDTO.setCreationDate(Instant.now());
        userService.save(userDTO);
        return "redirect:/users";
    }



    @GetMapping("/{id}")
    public String showUpdateUserPage(Model model, @PathVariable Long id){
        Optional<UserDTO> user = userService.findOne(id);

        if(user.isPresent()){
            model.addAttribute("user", user.get());
            return "users/forms";
        }else{
            return "redirect:/users";
        }
    }


}
