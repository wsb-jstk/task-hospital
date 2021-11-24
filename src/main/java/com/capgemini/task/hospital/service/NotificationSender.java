package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Staff;

import java.time.YearMonth;

public interface NotificationSender {

    /**
     * Sends a payslip to given staff member
     */
    void sendEmailWithPayslip(Staff staff, YearMonth yearMonth);

    /**
     * Sends report about patients treated by doctor in given month of the year
     */
    void sendEmailWithMonthSummary(MedicalDoctor medicalDoctor, YearMonth yearMonth);

    /**
     * Sends SMS to given staff member with provided text
     */
    void sendEmergencySms(MedicalDoctor medicalDoctor, String text);
}
