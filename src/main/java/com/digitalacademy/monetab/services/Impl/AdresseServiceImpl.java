package com.digitalacademy.monetab.services.Impl;

import com.digitalacademy.monetab.models.Adresse;
import com.digitalacademy.monetab.repositories.AdresseRepositories;
import com.digitalacademy.monetab.services.AdresseService;
import com.digitalacademy.monetab.services.Mapper.AdresseMapper;
import com.digitalacademy.monetab.services.dto.AdresseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdresseServiceImpl implements AdresseService {

    private final AdresseRepositories adresseRepositories;

    @Override
    public AdresseDTO save(AdresseDTO adresseDTO) {
        log.debug("request to save Adresse : {}", adresseDTO);
        Adresse adresse = AdresseMapper.toEntity(adresseDTO);
        adresse = adresseRepositories.save(adresse);
        return AdresseMapper.toDto(adresse);
    }

    @Override
    public AdresseDTO update(AdresseDTO adresseDTO) {

        return findOne(adresseDTO.getId()).map(existAddress ->{
            existAddress.setRue(adresseDTO.getRue());
            existAddress.setPays(adresseDTO.getPays());
            return save(existAddress);
        }).orElseThrow( ()-> new RuntimeException("Adresse not found"));

////       Adresse adresse = AdresseMapper.toEntity(adresseDTO);
////       adresse = adresseRepositories.save(adresse);
//       return AdresseMapper.toDto(adresse);
    }

    @Override
    public Optional<AdresseDTO> findOne(Long id) {
        return adresseRepositories.findById(id).map(address -> {
            return AdresseMapper.toDto(address);
        });
    }

    @Override
    public List<AdresseDTO> findAll() {
        return adresseRepositories.findAll().stream().map(adresse -> {
            return AdresseMapper.toDto(adresse);
        }).toList();
//        quand c'est list -> stream() pour avoir map()
//                sinon directement map()
    }

    @Override
    public void delete(Long id) {
        adresseRepositories.deleteById(id);
    }
}
