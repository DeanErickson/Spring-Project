package com.example.spring.project.controller;

import com.example.spring.project.model.CD;
import com.example.spring.project.services.CDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@RestController
public class CDController {

    private final CDService cdService;

    public CDController(CDService cdService) {
        this.cdService = cdService;
    }

    @GetMapping("/")
    public String Home() {

        return "Welcome Home";
    }

    @RequestMapping("/cd")
    public ArrayList<CD> getAllCDs() {

        return cdService.getListOfCDs();
    }

    @RequestMapping("/cd/{id}")
    public ResponseEntity<CD> getByID(@PathVariable UUID id) {
        Optional<CD> optionalCD = cdService.getCDbyID(id);
        return optionalCD.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping("/cd")
    void addNewCD(@RequestBody CD cd) {
        cdService.add(cd);
    }



}
