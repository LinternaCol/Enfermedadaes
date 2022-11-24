package com.savia.hemofilia.model;

import javax.persistence.*;

@Entity
@Table(name = "table")
public class EnfermedadesModelDirect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hemofilia", nullable = false,unique = true)
    private Long id;
}
