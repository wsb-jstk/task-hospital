package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.HospitalWard;

import java.time.LocalDate;

public interface WardMaintenanceService {

    /**
     * Request for full clean of the ward
     */
    void requestCleaning(HospitalWard hospitalWard, LocalDate localDate);

    /**
     * Request for refill drugs in storage of the ward
     */
    void requestForDrugStorageRefill(HospitalWard hospitalWard);

    /**
     * request for new staff
     */
    void requestForNewStaffMember(HospitalWard hospitalWard, String role);

}
