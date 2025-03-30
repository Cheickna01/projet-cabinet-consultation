package com.cheickna;

import com.cheickna.entities.Consultation;
import com.cheickna.entities.Patient;
import com.cheickna.repositories.ConsultationRepository;
import com.cheickna.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App implements CommandLineRunner
{
    private final ConsultationRepository consultationRepository;
    PatientRepository patientRepository;

    public App(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    public static void main(String[] args )
    {

        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Patient patient = new Patient();
        patient.setNom("Diaby");
        patient.setPrenom("Michael");
        patient.setEmail("diaby@gmail.com");
        patient.setTel("123456789");
        patientRepository.save(patient);*/

        /*Patient patient =patientRepository.findById(2L).get();
        patient.setNom("Hassan");
        patient.setPrenom("Hassan");
        patientRepository.save(patient);*/

        /*Patient patient =patientRepository.findById(2L).get();
        Consultation consultation = new Consultation();
        Date date = Date.valueOf(LocalDate.of(2025, Month.MARCH, 02));
        consultation.setDateConsultation(date);
        consultation.setDescription("Consultation1");
        consultation.setPatient(patient);
        consultationRepository.save(consultation);*/
    }
}
