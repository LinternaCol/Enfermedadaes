package com.savia.hemofilia.controller;

import com.savia.hemofilia.service.HemofiliaServiceDirect;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class HemofiliaController {
    @Autowired
    HemofiliaServiceDirect hemofiliaServiceDirect;
    @PostMapping("/upload")
    public ResponseEntity<Message> upload(){
        return (hemofiliaServiceDirect.save());
    }
}
