package com.capgemini.task.hospital.domain;

import com.capgemini.task.hospital.PatientRepository;
import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Nurse;
import com.capgemini.task.hospital.mapper.PatientMapper;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Specific hospital ward (aka department)
 */
public class HospitalWard {

    private Department type;
    private int capacity;
    private List<Patient> patients;
    private List<MedicalDoctor> medicalDoctors;
    private List<Nurse> nurses;

    public HospitalWard(Department type, int capacity, List<Patient> patients, List<MedicalDoctor> medicalDoctors, List<Nurse> nurses) {
        this.type = type;
        this.capacity = capacity;
        this.patients = patients;
        this.medicalDoctors = medicalDoctors;
        this.nurses = nurses;
    }

    public boolean hasFreePlace() {
        return capacity - patients.size() > 0;
    }

    public void admitPatient(PatientRegistrationInfo info) {
        HospitalRecord hospitalRecord = new HospitalRecord();
        hospitalRecord.setAdmissionDate(LocalDateTime.now());
        hospitalRecord.setSymptoms(info.getSymptoms());

        Patient patient = PatientRepository.find(info.getDocument());
        if (patient == null) {
            patient = PatientMapper.map(info);
            PatientRepository.save(patient);
        }
        patient.getHospitalRecords().add(hospitalRecord);
        patients.add(patient);
    }

    public void hireMedicalDoctor(MedicalDoctor medicalDoctor) {
        this.medicalDoctors.add(medicalDoctor);
    }

    public void hireNurse(Nurse nurse) {
        this.nurses.add(nurse);
    }

    // getters and setters

    public Department getType() {
        return type;
    }

    public void setType(Department type) {
        this.type = type;
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
