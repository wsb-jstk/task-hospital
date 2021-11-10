package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.*;

import java.time.LocalDate;
import java.util.Set;

class Manager implements Staff {

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
    public void treat(Patient patient) {
        throw new IllegalStateException("I can't do that");
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
        // hire
    }

    @Override
    public void terminateContract(Staff staff) {
        // terminate contract
    }
}

