package com.digitalacademy.monetab.repositories;

import com.digitalacademy.monetab.models.FicheNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheNoteRepositories extends JpaRepository<FicheNote, Long> {

    FicheNote findByNote(double note);
}
