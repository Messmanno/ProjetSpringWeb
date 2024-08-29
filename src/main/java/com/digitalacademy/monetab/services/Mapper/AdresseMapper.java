package com.digitalacademy.monetab.services.Mapper;

import com.digitalacademy.monetab.models.Adresse;
import com.digitalacademy.monetab.services.dto.AdresseDTO;

public final class AdresseMapper {
    private AdresseMapper(){}

    public static AdresseDTO toDto(Adresse adresse){
        AdresseDTO adresseDTO = new AdresseDTO();
        adresseDTO.setId(adresse.getId());
        adresseDTO.setPays(adresse.getPays());
        adresseDTO.setRue(adresse.getRue());
        adresseDTO.setVille(adresse.getVille());
        return adresseDTO;
    }

    public static Adresse toEntity(AdresseDTO adresseDTO){
        Adresse adresse = new Adresse();
        adresse.setId(adresseDTO.getId());
        adresse.setPays(adresseDTO.getPays());
        adresse.setRue(adresseDTO.getRue());
        adresse.setVille(adresseDTO.getVille());
        return adresse;
    }


}
