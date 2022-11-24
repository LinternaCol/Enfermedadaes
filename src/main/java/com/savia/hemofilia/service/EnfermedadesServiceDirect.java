package com.savia.hemofilia.service;

import com.savia.hemofilia.valueobject.Message;
import org.springframework.http.ResponseEntity;


public interface EnfermedadesServiceDirect {

    ResponseEntity<Message> saveHemofilia();
    ResponseEntity<Message> saveVih();
    ResponseEntity<Message> saveRenales();
    ResponseEntity<Message> saveHepatitisA();
    ResponseEntity<Message> saveHepatitisB();
    ResponseEntity<Message> saveHepatitisC();
    ResponseEntity<Message> saveCancer();
    ResponseEntity<Message> saveArtritis();
}
