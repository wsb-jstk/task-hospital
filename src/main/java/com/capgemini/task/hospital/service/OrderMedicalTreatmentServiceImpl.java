package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Diagnostic;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.staff.MedicalDoctor;

import java.time.LocalDate;

public class OrderMedicalTreatmentServiceImpl implements OrderMedicalTreatmentService {

    @Override
    public void orderInjection(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate) {
        // logic
    }

    @Override
    public void orderSurgery(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, String remarks) {
        // logic
    }

    @Override
    public void orderDiagnostic(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, Diagnostic diagnostic, String remarks) {
        // logic
    }

}
