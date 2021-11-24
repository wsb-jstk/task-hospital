package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.HospitalWard;

import java.time.LocalDate;

public class WardMaintenanceService {

    public void requestCleaning(HospitalWard hospitalWard, LocalDate localDate) {
        // request for full clean of the ward
    }

    public void requestForDrugStorageRefill(HospitalWard hospitalWard) {
        // request for refill drugs in storage of the ward
    }

    public void requestForNewStaffMember(HospitalWard hospitalWard, String role) {
        // request for new staff
    }

}
