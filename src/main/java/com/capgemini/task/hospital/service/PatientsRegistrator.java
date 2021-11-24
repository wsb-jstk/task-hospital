package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Department;
import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.Nationality;

import java.time.LocalDate;

public interface PatientsRegistrator {

    /**
     * Try to admit patient to given ward.
     *
     * @return true if patient was admitted; false otherwise
     */
    boolean admitPatient(Department department, String symptoms, LocalDate localDate, String firstName, String lastName, //
                         LocalDate birthDate, DocumentId document, int height, int weight, Nationality nationality);
}
