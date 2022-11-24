package com.savia.hemofilia.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.savia.hemofilia.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServiceImpl implements UploadService {
	private String folder="cargas\\";
	private final Logger logg = LoggerFactory.getLogger(UploadServiceImpl.class);

	@Override
	public String save(MultipartFile file, int idEnfermedad) {
		if (!file.isEmpty()) {
			try {
				byte [] bytes= file.getBytes();
				if (idEnfermedad ==1){
					Path path = Paths.get( folder+"hemofilia.csv" );
					Files.write(path, bytes);
				}if(idEnfermedad ==2){
					Path path = Paths.get( folder+"vih.csv" );
					Files.write(path, bytes);
				}
				if(idEnfermedad ==3){
					Path path = Paths.get( folder+"renales.csv" );
					Files.write(path, bytes);
				}if(idEnfermedad ==4){
					Path path = Paths.get( folder+"hepatitisA.csv" );
					Files.write(path, bytes);
				}
				if(idEnfermedad ==5){
					Path path = Paths.get( folder+"hepatitisB.csv" );
					Files.write(path, bytes);
				}if(idEnfermedad ==6){
					Path path = Paths.get( folder+"hepatitisC.csv" );
					Files.write(path, bytes);
				}if(idEnfermedad ==7){
					Path path = Paths.get( folder+"cancer.csv" );
					Files.write(path, bytes);
				}if(idEnfermedad ==8){
					Path path = Paths.get( folder+"artritis.csv" );
					Files.write(path, bytes);
				}
				logg.info("Archivo guardado");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "Archivo guardado correctamente";
	}
	
	
}
