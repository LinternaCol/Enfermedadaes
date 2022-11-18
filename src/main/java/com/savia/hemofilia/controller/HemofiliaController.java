package com.savia.hemofilia.controller;

import com.savia.hemofilia.service.EnfermedadesServiceDirect;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HemofiliaController {
    @Autowired
    EnfermedadesServiceDirect enfermedadesServiceDirect;
    @PostMapping("/hemofilia")
    public ResponseEntity<Message> uploadHemofilia(){
        return (enfermedadesServiceDirect.saveHemofilia());
    }

    @PostMapping("/vih")
    public ResponseEntity<Message> uploadVih(){
        return (enfermedadesServiceDirect.saveVih());
    }
}
