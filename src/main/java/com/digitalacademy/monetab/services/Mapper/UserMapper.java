package com.digitalacademy.monetab.services.Mapper;

import com.digitalacademy.monetab.models.User;
import com.digitalacademy.monetab.services.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserMapper {

    public static User toEntity(UserDTO dto) {
        if (dto == null) {
            return null;
        }

        User user = new User();
        user.setId(dto.getId());
        user.setPseudo(dto.getPseudo());
        user.setPassword(dto.getPassword()); // Assurez-vous que le mot de passe est bien transféré
        user.setCreationDate(dto.getCreationDate());


        // Ne pas mapper confirmpassword à l'entité, car ce champ est seulement pour la validation
        // user.setConfirmpassword(dto.getConfirmpassword()); // Ce champ ne devrait pas être mappé

        return user;
    }

    public static UserDTO toDto(User user) {
        if (user == null) {
            return null;
        }

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setPseudo(user.getPseudo());
        dto.setPassword(user.getPassword()); // Assurez-vous que le mot de passe est bien transféré
        dto.setCreationDate(user.getCreationDate());

        // Ne pas mapper confirmpassword du modèle vers le DTO, car ce champ est seulement pour la validation
        // dto.setConfirmpassword(user.getConfirmpassword()); // Ce champ ne devrait pas être mappé

        return dto;
    }
}
