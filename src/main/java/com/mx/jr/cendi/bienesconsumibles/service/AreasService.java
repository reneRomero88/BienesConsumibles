package com.mx.jr.cendi.bienesconsumibles.service;

import com.mx.jr.cendi.bienesconsumibles.model.Areas;

public interface AreasService {
    public Boolean saveAreas(Areas user);
    public Boolean deleteAreas(Areas user);
    public Boolean findAreasById(String id);
}