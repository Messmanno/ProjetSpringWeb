package com.digitalacademy.monetab.services;

import com.digitalacademy.monetab.models.Adresse;
import com.digitalacademy.monetab.models.Adresse;
import com.digitalacademy.monetab.services.dto.AdresseDTO;


import java.util.List;
import java.util.Optional;


public interface AdresseService {

    AdresseDTO save(AdresseDTO adresseDTO);

    AdresseDTO update(AdresseDTO adresseDTO);

    Optional<AdresseDTO> findOne(Long id);

    List<AdresseDTO> findAll();

    void delete(Long id);

}
