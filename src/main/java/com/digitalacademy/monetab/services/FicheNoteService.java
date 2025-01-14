package com.digitalacademy.monetab.services;

import com.digitalacademy.monetab.models.FicheNote;

import java.util.List;
import java.util.Optional;

public interface FicheNoteService {

    FicheNote save(FicheNote ficheNote);

    FicheNote update(FicheNote ficheNote);

    Optional<FicheNote> findOne(Long id);

    List<FicheNote> findAll();

    void delete(Long id);
}
