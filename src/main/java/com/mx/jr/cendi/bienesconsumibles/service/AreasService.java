package com.mx.jr.cendi.bienesconsumibles.service;

import java.util.List;

import com.mx.jr.cendi.bienesconsumibles.model.Areas;

public interface AreasService {
    public Boolean edit(Areas user);
    public Boolean delete(Areas user);
    public Boolean find(String id);
    public List<Areas> findAll();
}