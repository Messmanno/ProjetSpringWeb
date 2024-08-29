package com.digitalacademy.monetab.services.Impl;

import com.digitalacademy.monetab.models.FicheNote;
import com.digitalacademy.monetab.models.Student;
import com.digitalacademy.monetab.repositories.FicheNoteRepositories;
import com.digitalacademy.monetab.services.FicheNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FicheNoteServiceImpl implements FicheNoteService {

    @Autowired
    private final FicheNoteRepositories ficheNoteRepositories;

    @Override
    public FicheNote save(FicheNote ficheNote) {
        return ficheNoteRepositories.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {
        Optional<FicheNote> optionalFicheNote = findOne(ficheNote.getId()); //Recup d'un Optional<User>
        if(optionalFicheNote.isPresent()){ //verification du contenu
            FicheNote updatedFicheNote = optionalFicheNote.get();
            updatedFicheNote.setNote(ficheNote.getNote());
            return save(updatedFicheNote); //Enregistrement du user modifié
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<FicheNote> findOne(Long id) {
        return ficheNoteRepositories.findById(id);
    }

    @Override
    public List<FicheNote> findAll() {
        return ficheNoteRepositories.findAll();
    }

    @Override
    public void delete(Long id) {
        ficheNoteRepositories.deleteById(id);
    }

    @Override
    public String toString() {
        return "FicheNoteServiceImpl{" +
                "ficheNoteRepositories=" + ficheNoteRepositories +
                '}';
    }
}
