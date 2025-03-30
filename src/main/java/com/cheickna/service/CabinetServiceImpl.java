package com.cheickna.service;

import com.cheickna.entities.Consultation;
import com.cheickna.entities.Patient;
import com.cheickna.repositories.ConsultationRepository;
import com.cheickna.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabinetServiceImpl implements CabinetService{
    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;

    public CabinetServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatient(Long id) {
        return patientRepository.findById(id);
    }


    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public Optional<Consultation> getConsultation(Long id) {
        return consultationRepository.findById(id);
    }

    @Override
    public void updateConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    @Override
    public void deleteConsultation(Long id) {
        consultationRepository.deleteById(id);
    }
}
