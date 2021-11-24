package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.*;

import java.time.LocalDate;
import java.util.Set;

public class Nurse implements Staff, Injector {

    private String firstName;
    private String lastName;
    private Sex sex;
    private LocalDate birthDate;
    private DocumentId documentId;
    private Set<Qualification> qualifications;

    @Override
    public Set<Qualification> getQualifications() {
        return qualifications;
    }

    @Override
    public void doInjection(Patient patient, Medicament medicament) {
        // do injection
    }
}
