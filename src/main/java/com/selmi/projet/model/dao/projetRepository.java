package com.selmi.projet.model.dao;
import com.selmi.projet.model.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface projetRepository extends JpaRepository<Projet,Long> {

    List<Projet> findAll();
    Optional<Projet> findById(Long id);
    Projet save(Projet p);
}
