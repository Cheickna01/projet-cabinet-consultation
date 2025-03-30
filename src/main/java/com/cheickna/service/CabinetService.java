package com.cheickna.service;

import com.cheickna.entities.Consultation;
import com.cheickna.entities.Patient;

import java.util.List;
import java.util.Optional;

public interface CabinetService {
    void addPatient(Patient patient);
    List<Patient> getAllPatients();
    Optional<Patient> getPatient(Long id);
    void updatePatient(Patient patient);
    void deletePatient(Long id);

    void addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    Optional<Consultation> getConsultation(Long id);
    void updateConsultation(Consultation consultation);
    void deleteConsultation(Long id);

}
