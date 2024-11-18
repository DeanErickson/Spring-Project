package com.example.spring.project.services;

import com.example.spring.project.model.CD;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CDService {

    private final Map<UUID, CD> cds;

    // Constructor for CDService
    public CDService() {
        cds = new HashMap<>();

        this.add(new CD("Around The Fur", "Deftones"));
        this.add(new CD("Reign In Blood", "Slayer"));
        this.add(new CD("Kill 'em All", "Metallica"));
        this.add(new CD("PowerSlave", "Iron Maiden"));
        this.add(new CD("Significant Other", "Limp Bizkit"));
    }

    public ArrayList<CD> getListOfCDs() {
        return new ArrayList<>(cds.values());
    }

    public Optional<CD> getCDbyID(UUID id) {
        return Optional.ofNullable(cds.get(id));
    }

    public void add(CD cd) {
        cds.put(cd.getId(),cd);

    }



}



