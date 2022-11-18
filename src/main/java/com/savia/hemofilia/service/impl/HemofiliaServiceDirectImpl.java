package com.savia.hemofilia.service.impl;

import com.savia.hemofilia.repository.HemofiliaRepositoryDirect;
import com.savia.hemofilia.service.HemofiliaServiceDirect;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.Scanner;

@Service
public class HemofiliaServiceDirectImpl implements HemofiliaServiceDirect {

    @Autowired
    HemofiliaRepositoryDirect hemofiliaRepositoryDirect;
    @Override
    @Transactional
    public ResponseEntity<Message> save() {
        Date fechaInicio = new Date();

        try {
            hemofiliaRepositoryDirect.bulkLoadData();
            Date fechaFin = new Date();
            System.out.println("Fecha Inicio  : "+fechaInicio);
            System.out.println("Fecha Fin : "+fechaFin);
            return ResponseEntity.ok()
                    .body(new Message("El archivo:  se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: tiene un error  : "+e.getLocalizedMessage()));

        }


    }
}
