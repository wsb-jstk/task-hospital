package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.*;

import java.time.LocalDate;
import java.util.Set;

public class MedicalDoctor implements Staff {

    private String firstName;
    private String lastName;
    private Sex sex;
    private LocalDate birthDate;
    private DocumentId documentId;
    private Set<Qualification> qualifications;
    private String phoneNumber;

    @Override
    public Set<Qualification> getQualifications() {
        return qualifications;
    }

    @Override
    public void treat(Patient patient) {
        // treat
    }

    @Override
    public void doInjection(Patient patient) {
        throw new IllegalStateException("I can't do that");
    }

    @Override
    public void clean(HospitalWard hospitalWard) {
        throw new IllegalStateException("I can't do that");
    }

    @Override
    public void hireStaff(Staff staff) {
        throw new IllegalStateException("I can't do that");
    }

    @Override
    public void terminateContract(Staff staff) {
        throw new IllegalStateException("I can't do that");
    }

    // getters and setters

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
