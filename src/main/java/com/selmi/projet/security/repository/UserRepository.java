package com.selmi.projet.security.repository;

import com.selmi.projet.modele.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by BMH
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    void delete(User user);
    List<User> findAll();
    User save(User user);
    List<User> findAllById(Long id);
}
