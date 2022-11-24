package com.savia.hemofilia.controller;

import com.savia.hemofilia.service.EnfermedadesServiceDirect;
import com.savia.hemofilia.service.UploadService;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class EnfermedadesController {
    @Autowired
    private UploadService upload;
    @Autowired
    EnfermedadesServiceDirect enfermedadesServiceDirect;
    @PostMapping("/hemofilia")
    public ResponseEntity<Message> uploadHemofilia(@RequestParam("file") MultipartFile file){
        upload.save(file,1);
        return (enfermedadesServiceDirect.saveHemofilia());
    }

    @PostMapping("/vih")
    public ResponseEntity<Message> uploadVih(@RequestParam("file") MultipartFile file){
        upload.save(file,2);
        return (enfermedadesServiceDirect.saveVih());
    }
    @PostMapping("/renales")
    public ResponseEntity<Message> uploadRenales(@RequestParam("file") MultipartFile file){
        upload.save(file,3);
        return (enfermedadesServiceDirect.saveRenales());
    }

    @PostMapping("/hepatitis/uno")
    public ResponseEntity<Message> uploadHepatitisA(@RequestParam("file") MultipartFile file){
        upload.save(file,4);
        return (enfermedadesServiceDirect.saveHepatitisA());
    }
    @PostMapping("/hepatitis/dos")
    public ResponseEntity<Message> uploadHepatitisB(@RequestParam("file") MultipartFile file){
        upload.save(file,5);
        return (enfermedadesServiceDirect.saveHepatitisB());
    }
    @PostMapping("/hepatitis/tres")
    public ResponseEntity<Message> uploadHepatitisC(@RequestParam("file") MultipartFile file){
        upload.save(file,6);
        return (enfermedadesServiceDirect.saveHepatitisC());
    }
    @PostMapping("/cancer")
    public ResponseEntity<Message> uploadCancer(@RequestParam("file") MultipartFile file){
        upload.save(file,7);
        return (enfermedadesServiceDirect.saveCancer());
    }
    @PostMapping("/artritis")
    public ResponseEntity<Message> uploadArtritis(@RequestParam("file") MultipartFile file){
        upload.save(file,8);
        return (enfermedadesServiceDirect.saveArtritis());
    }


}
