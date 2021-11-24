package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.staff.Staff;

import java.time.YearMonth;

public interface SalaryCalculator {

    /**
     * Calculate salary for staff in given month of the year
     */
    void calculateSalary(Staff staff, YearMonth yearMonth);

    /**
     * Calculate salary for given ward in given month of the year
     */
    void calculateSalary(HospitalWard hospitalWard, YearMonth yearMonth);

}
