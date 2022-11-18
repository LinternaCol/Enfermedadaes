package com.savia.hemofilia.service;

import com.savia.hemofilia.valueobject.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;


public interface HemofiliaServiceDirect {

    ResponseEntity<Message> save();
}
