package com.digitalacademy.monetab.repositories;

import com.digitalacademy.monetab.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepositories extends JpaRepository<Personne, Long> {
}
