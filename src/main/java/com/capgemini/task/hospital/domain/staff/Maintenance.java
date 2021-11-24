package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.Qualification;
import com.capgemini.task.hospital.domain.Sex;

import java.time.LocalDate;
import java.util.Set;

class Maintenance implements Staff, Cleaner {

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
    public void clean(HospitalWard hospitalWard) {
        // clean
    }


}
