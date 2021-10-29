package com.openapi.swagger.controllers;

import com.openapi.swagger.mysql.Place;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class SwagOneController {


    @GetMapping
    public String welcomePage() {
        return "Wilcomen on the frontier loading page";
    }

    @GetMapping("/get")
    public Place getIt() {
        return new Place();
//                new Place(849L, "Himalayes", "414.211.873", "101.650.330");
    }
}
