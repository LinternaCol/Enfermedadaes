package com.savia.hemofilia.service.impl;

import com.savia.hemofilia.repository.EnfermedadesRepositoryDirect;
import com.savia.hemofilia.service.EnfermedadesServiceDirect;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class EnfermedadesServiceDirectImpl implements EnfermedadesServiceDirect {

    @Autowired
    EnfermedadesRepositoryDirect enfermedadesRepositoryDirect;
    @Override
    @Transactional
    public ResponseEntity<Message> saveHemofilia() {
        try {
            enfermedadesRepositoryDirect.hemofiliaSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }
    }
    @Override
    @Transactional
    public ResponseEntity<Message> saveVih() {
        try {
            enfermedadesRepositoryDirect.vihSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }
    @Override
    @Transactional
    public ResponseEntity<Message> saveRenales() {
        try {
            enfermedadesRepositoryDirect.renalesSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }

    @Override
    @Transactional
    public ResponseEntity<Message> saveHepatitisA() {
        try {
            enfermedadesRepositoryDirect.hepatitisASave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }
    @Override
    @Transactional
    public ResponseEntity<Message> saveHepatitisB() {
        try {
            enfermedadesRepositoryDirect.hepatitisBSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }
    @Override
    @Transactional
    public ResponseEntity<Message> saveHepatitisC() {
        try {
            enfermedadesRepositoryDirect.hepatitisCSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }
    @Override
    @Transactional
    public ResponseEntity<Message> saveCancer() {
        try {
            enfermedadesRepositoryDirect.cancerSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }
    @Override
    @Transactional
    public ResponseEntity<Message> saveArtritis() {
        try {
            enfermedadesRepositoryDirect.artritisSave();
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));
        }

    }
}
