package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.Department;
import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.PatientRegistrationInfo;

import java.util.Map;

public class PatientsRegistratorImpl implements PatientsRegistrator {

    private Map<Department, HospitalWard> wards;

    public PatientsRegistratorImpl(Map<Department, HospitalWard> wards) {
        this.wards = wards;
    }

    /**
     * Try to admit patient to given ward.
     *
     * @return true if patient was admitted; false otherwise
     */
    @Override
    public boolean admitPatient(Department department, PatientRegistrationInfo info) {
        HospitalWard ward = wards.get(Department.INTENSIVE_CARE_UNIT);
        if (ward == null) {
            return false;
        }
        if (ward.hasFreePlace()) {
            ward.admitPatient(info);
            return true;
        }
        return false;
    }

}
