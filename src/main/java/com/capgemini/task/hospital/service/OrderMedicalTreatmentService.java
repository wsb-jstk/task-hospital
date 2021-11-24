package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Diagnostic;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.staff.MedicalDoctor;

import java.time.LocalDate;

public class OrderMedicalTreatmentService {

    public void orderInjection(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate) {
        // order an injection for the patient
    }

    public void orderSurgery(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, String remarks) {
        // order to plan a surgery for a patient
    }

    public void orderDiagnostic(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, Diagnostic diagnostic, String remarks) {
        // order some diagnostic which should be done on patient
    }

}
