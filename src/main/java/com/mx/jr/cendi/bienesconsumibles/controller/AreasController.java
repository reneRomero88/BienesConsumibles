package com.mx.jr.cendi.bienesconsumibles.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.jr.cendi.bienesconsumibles.model.Areas;
import com.mx.jr.cendi.bienesconsumibles.service.AreasService;

@RestController
@RequestMapping(path = "/areas")
public class AreasController {
    @Autowired
    private AreasService areasService;

    @RequestMapping(value = "/saveAreas", method = RequestMethod.POST
    )
    public Boolean saveUser(@RequestBody Areas area) {
        return areasService.saveAreas(area);
    }

    @RequestMapping(value = "/deleteAreas", method = RequestMethod.POST)
    public Boolean deleteUser(@RequestBody Areas area) {
        return areasService.saveAreas(area);
    }

    @RequestMapping(value = "/findAreasById", method = RequestMethod.POST)
    public Boolean findAreasById(@RequestBody Areas area) {
        return areasService.saveAreas(area);
    }
}