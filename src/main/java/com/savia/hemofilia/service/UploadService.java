package com.savia.hemofilia.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    public String save(MultipartFile file, int idEnfermedad);
}
