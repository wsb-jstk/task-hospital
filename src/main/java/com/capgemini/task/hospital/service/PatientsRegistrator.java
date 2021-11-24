package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Department;
import com.capgemini.task.hospital.domain.PatientRegistrationInfo;

public interface PatientsRegistrator {

    /**
     * Try to admit patient to given ward.
     *
     * @return true if patient was admitted; false otherwise
     */
    boolean admitPatient(Department department, PatientRegistrationInfo patientRegistrationInfo);
}
