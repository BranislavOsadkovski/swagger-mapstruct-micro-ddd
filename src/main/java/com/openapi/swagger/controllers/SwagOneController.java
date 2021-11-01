package com.openapi.swagger.controllers;

import com.openapi.swagger.dto.PlaceDTO;
import com.openapi.swagger.dto.PlaceMapper;
import com.openapi.swagger.mysql.Place;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class SwagOneController {

    private PlaceMapper placeMapper = Mappers.getMapper(PlaceMapper.class);

    @GetMapping
    public String welcomePage() {
        return "Wilcomen on the frontier loading page";
    }

    @GetMapping("/get")
    public PlaceDTO getIt() {

        Place p = new Place(849L, "Himalayes", "414.211.873", "101.650.330");
        return placeMapper.mapSourceToDestination(p);
    }
}
