package com.cheickna.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    @Column(length = 50, nullable = false)
    private String nom;
    @Column(length = 50, nullable = false)
    private String prenom;
    @Column(length = 100)
    private String email;
    @Column(length = 10)
    private String tel;
    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultations;
}