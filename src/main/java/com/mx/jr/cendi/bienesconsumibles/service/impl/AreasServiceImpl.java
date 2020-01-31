package com.mx.jr.cendi.bienesconsumibles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.jr.cendi.bienesconsumibles.model.Areas;
import com.mx.jr.cendi.bienesconsumibles.model.User;
import com.mx.jr.cendi.bienesconsumibles.repository.AreasRepository;
import com.mx.jr.cendi.bienesconsumibles.repository.UserRepository;
import com.mx.jr.cendi.bienesconsumibles.service.AreasService;
import com.mx.jr.cendi.bienesconsumibles.service.UserService;

@Service
public class AreasServiceImpl implements AreasService {
    @Autowired
    private AreasRepository areasRepository;

    @Override
    public Boolean edit(Areas area) {
        try {
            areasRepository.save(area);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public Boolean delete(Areas area) {
        try {
            areasRepository.delete(area);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean find(String id) {
        try {
            areasRepository.findById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Areas> findAll() {
        try {
            return areasRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }
}