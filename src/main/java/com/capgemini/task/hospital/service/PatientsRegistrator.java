package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Department;
import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.Nationality;

import java.time.LocalDate;
import java.util.Map;

public class PatientsRegistrator {

    private Map<Department, HospitalWard> wards;

    public PatientsRegistrator(Map<Department, HospitalWard> wards) {
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

}
