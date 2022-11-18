package com.savia.hemofilia.service;

import com.savia.hemofilia.valueobject.Message;
import org.springframework.http.ResponseEntity;


public interface EnfermedadesServiceDirect {

    ResponseEntity<Message> saveHemofilia();
    ResponseEntity<Message> saveVih();
}
