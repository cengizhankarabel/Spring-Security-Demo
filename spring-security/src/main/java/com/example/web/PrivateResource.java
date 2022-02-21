package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateResource {

    @GetMapping(value = "/api/private-resource")
    public String getPrivateResource(){
        return "PRIVATE-RESOURCE";
    }
}
