package com.savia.hemofilia.repository;


import com.savia.hemofilia.model.EnfermedadesModelDirect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EnfermedadesRepositoryDirect extends JpaRepository<EnfermedadesModelDirect,Long> {

    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//hemofilia.csv' INTO TABLE tbl_hemofilia_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void hemofiliaSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//vih.csv' INTO TABLE tbl_vih_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void vihSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//renales.csv' INTO TABLE tbl_renales_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void renalesSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//hepatitisA.csv' INTO TABLE tbl_hepatitis_1_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void hepatitisASave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//hepatitisB.csv' INTO TABLE tbl_hepatitis_2_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void hepatitisBSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//hepatitisC.csv' INTO TABLE tbl_hepatitis_3_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void hepatitisCSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//artritis.csv' INTO TABLE tbl_artritis_reumatoide_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void artritisSave();
    @Modifying
    @Transactional
    @Query (value="LOAD DATA LOCAL INFILE 'cargas//cancer.csv' INTO TABLE tbl_cancer_paso FIELDS TERMINATED BY ';' LINES TERMINATED BY '\\n' IGNORE 1 ROWS;", nativeQuery = true)
    public void cancerSave();




}
