package com.savia.hemofilia.model;

import javax.persistence.*;

@Entity
@Table(name = "hemofilia")
public class HemofiliaModelDirect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHemofilia", nullable = false,unique = true)
    private Long id;
}
