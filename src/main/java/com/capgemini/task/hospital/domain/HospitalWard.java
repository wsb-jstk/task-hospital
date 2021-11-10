package com.capgemini.task.hospital.domain;

import com.capgemini.task.hospital.Patients;
import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Nurse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Specific hospital ward (aka department)
 */
public class HospitalWard {

    private String name;
    private int capacity;
    private List<Patient> patients;
    private List<MedicalDoctor> medicalDoctors;
    private List<Nurse> nurses;

    public HospitalWard(String name, int capacity, List<Patient> patients, List<MedicalDoctor> medicalDoctors, List<Nurse> nurses) {
        this.name = name;
        this.capacity = capacity;
        this.patients = patients;
        this.medicalDoctors = medicalDoctors;
        this.nurses = nurses;
    }

    public boolean hasFreePlace() {
        return capacity - patients.size() > 0;
    }

    public void admitPatient(String symptoms, LocalDate localDate, String firstName, String lastName, LocalDate birthDate, DocumentId document, int height, int weight, Nationality nationality) {
        HospitalRecord hospitalRecord = new HospitalRecord();
        hospitalRecord.setAdmissionDate(LocalDateTime.now());
        hospitalRecord.setSymptoms(symptoms);

        if (Patients.isKnownPatient(firstName, lastName, birthDate, document, height, weight, nationality)) {
            Patient patient = Patients.find(document);
            patient.getHospitalRecords().add(hospitalRecord);
            patients.add(patient);
        } else {
            Patient patient = Patients.createPatient(firstName, lastName, birthDate, document, height, weight, nationality);
            patient.getHospitalRecords().add(hospitalRecord);
            patients.add(patient);
        }
    }

    public void hireMedicalDoctor(MedicalDoctor medicalDoctor) {
        this.medicalDoctors.add(medicalDoctor);
    }

    public void hireNurse(Nurse nurse) {
        this.nurses.add(nurse);
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<MedicalDoctor> getMedicalDoctors() {
        return medicalDoctors;
    }

    public void setMedicalDoctors(List<MedicalDoctor> medicalDoctors) {
        this.medicalDoctors = medicalDoctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }
}
