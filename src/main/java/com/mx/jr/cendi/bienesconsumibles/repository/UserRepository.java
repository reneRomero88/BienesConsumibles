package com.mx.jr.cendi.bienesconsumibles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.jr.cendi.bienesconsumibles.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public List<User> findByEmail(String email);

    public List<User> findByNameAndEmail(String name, String email);
}