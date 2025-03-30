package com.cheickna.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsultation;
    private Date dateConsultation;
    private String description;
    @ManyToOne
    @JoinColumn(name = "patient_id_patient")
    private Patient patient;
}
