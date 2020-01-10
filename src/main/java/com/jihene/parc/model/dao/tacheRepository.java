package com.jihene.parc.model.dao;

import com.jihene.parc.model.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tacheRepository extends JpaRepository<Tache,Long> {
}
