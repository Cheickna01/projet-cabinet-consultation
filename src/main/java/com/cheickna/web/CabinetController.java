package com.cheickna.web;

import com.cheickna.entities.Consultation;
import com.cheickna.entities.Patient;
import com.cheickna.service.CabinetService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CabinetController {
    private CabinetService cabinetService;

    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }


    @GetMapping("/patients")
    public String getPatients(Model model) {
        List<Patient> patients = cabinetService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients_list";
    }

    @GetMapping("/patients/new")
    public String newPatient(Model model) {
        Patient patient = new Patient();
        model.addAttribute("patient", patient);
        return "add_patient";
    }

    @PostMapping("/patients/new/save")
    public String savePatient(Patient patient){
        cabinetService.addPatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/delete")
    public String deletePatient(@RequestParam Long id) {
        cabinetService.deletePatient(id);
        return "redirect:/patients";
    }

    @GetMapping("/patients/update")
    public String updatePatient(Model model, @RequestParam("id") Long id) {
        model.addAttribute("patient", cabinetService.getPatient(id));
        return "update_patient";
    }

    @PostMapping("/patients/update/save")
    public String saveUpdatePatient(Patient patient){
        cabinetService.updatePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/consultations")
    public String getConsultations(Model model) {
        List<Consultation> consultations = cabinetService.getAllConsultations();
        model.addAttribute("consultations", consultations);
        return "consultations";
    }

    @GetMapping("/consultation/new")
    public String newConsultation(Model model){
        Consultation consultation = new Consultation();
        List<Patient> patients = cabinetService.getAllPatients();
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", patients);
        return "add_consul";
    }

    @PostMapping("/consultations/new/save")
    public String saveConsultation(Consultation consultation){
        cabinetService.addConsultation(consultation);
        return "redirect:/consultations";
    }

    @GetMapping("/consultations/delete")
    public String deleteConsultation(@RequestParam Long id){
        cabinetService.deleteConsultation(id);
        return "redirect:/consultations";
    }

    @GetMapping("/consultations/update")
    public String updateConsultation(@RequestParam("id") Long id, Model model){
        List<Patient> patients = cabinetService.getAllPatients();
        model.addAttribute("consultation", cabinetService.getConsultation(id));
        model.addAttribute("patients", patients);
        return "update_consul";
    }

    @PostMapping("/consultations/update/save")
    public String saveUpdateConsultation(Consultation consultation){
        cabinetService.updateConsultation(consultation);
        return "redirect:/consultations";
    }
}
