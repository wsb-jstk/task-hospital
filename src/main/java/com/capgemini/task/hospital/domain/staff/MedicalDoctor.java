package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.Qualification;
import com.capgemini.task.hospital.domain.Sex;

import java.time.LocalDate;
import java.util.Set;

public class MedicalDoctor implements Staff, Healer {

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
    public void heal(Patient patient) {
        // treat
    }

    // getters and setters

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
