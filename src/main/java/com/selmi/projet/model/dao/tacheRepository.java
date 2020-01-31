package com.selmi.projet.model.dao;

import com.selmi.projet.model.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tacheRepository extends JpaRepository<Tache,Long> {

}

