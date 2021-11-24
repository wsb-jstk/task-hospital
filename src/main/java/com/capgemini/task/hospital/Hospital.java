package com.capgemini.task.hospital;

import com.capgemini.task.hospital.domain.*;
import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Staff;
import com.external.vendor.sms.SmsGatewayImpl;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;

public class Hospital {

    private Map<Department, HospitalWard> wards;

    public Hospital(Map<Department, HospitalWard> wards) {
        this.wards = wards;
    }

    /**
     * Try to admit patient to given ward.
     *
     * @return true if patient was admitted; false otherwise
     */
    public boolean admitPatient(Department department, String symptoms, LocalDate localDate, String firstName, String lastName, //
                                LocalDate birthDate, DocumentId document, int height, int weight, Nationality nationality) {
        HospitalWard ward = wards.get(Department.INTENSIVE_CARE_UNIT);
        if (ward == null) {
            return false;
        }
        if (ward.hasFreePlace()) {
            ward.admitPatient(symptoms, localDate, firstName, lastName, birthDate, document, height, weight, nationality);
            return true;
        }
        return false;
    }

    public void requestCleaning(HospitalWard hospitalWard, LocalDate localDate) {
        // request for full clean of the ward
    }

    public void requestForDrugStorageRefill(HospitalWard hospitalWard) {
        // request for refill drugs in storage of the ward
    }

    public void requestForNewStaffMember(HospitalWard hospitalWard, String role) {
        // request for new staff
    }

    public void calculateSalary(Staff staff, YearMonth yearMonth) {
        // calculate salary for staff in given month of the year
    }

    public void calculateSalary(HospitalWard hospitalWard, YearMonth yearMonth) {
        // calculate salary for given ward in given month of the year
    }

    public void orderInjection(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate) {
        // order an injection for the patient
    }

    public void orderSurgery(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, String remarks) {
        // order to plan a surgery for a patient
    }

    public void orderDiagnostic(MedicalDoctor medicalDoctor, Patient patient, LocalDate localDate, Diagnostic diagnostic, String remarks) {
        // order some diagnostic which should be done on patient
    }

    public void sendEmailWithPayslip(Staff staff, YearMonth yearMonth) {
        // sends a payslip to given staff member
    }

    public void sendEmailWithMonthSummary(MedicalDoctor medicalDoctor, YearMonth yearMonth) {
        // sends report about patients treated by doctor in given month of the year
    }

    public void sendEmergencySms(MedicalDoctor medicalDoctor, String text) {
        // sends SMS to given staff member with provided text
        new SmsGatewayImpl().send(medicalDoctor.getPhoneNumber(), text);
    }
}
