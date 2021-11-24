package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Diagnostic;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.staff.MedicalDoctor;

import java.time.LocalDate;

public interface OrderMedicalTreatmentService {

    /**
     * Order an injection for the patient
     */
    void orderInjection(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate);

    /**
     * Order to plan a surgery for a patient
     */
    void orderSurgery(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, String remarks);

    /**
     * Order some diagnostic which should be done on patient
     */
    void orderDiagnostic(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, Diagnostic diagnostic, String remarks);

}
