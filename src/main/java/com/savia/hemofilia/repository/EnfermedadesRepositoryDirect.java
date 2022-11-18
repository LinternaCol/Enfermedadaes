package com.savia.hemofilia.repository;


import com.savia.hemofilia.model.HemofiliaModelDirect;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EnfermedadesRepositoryDirect extends CrudRepository<HemofiliaModelDirect,Long> {
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'C:/Users/JuanSuarez/Desktop/Savia/hemofilia/Documentacion/Hemofilia_Estructura_Reporte_2022_Direct.csv' INTO TABLE hemofilia FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void hemofiliaSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'C:/Users/JuanSuarez/Desktop/Savia/VIH/BASE DE DATOS RADICADA 2022_validar.csv' INTO TABLE tbl_vih FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void vihSave();


}
