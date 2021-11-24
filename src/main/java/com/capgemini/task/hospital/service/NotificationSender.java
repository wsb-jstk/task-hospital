package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Staff;
import com.external.vendor.sms.SmsGatewayImpl;

import java.time.YearMonth;

public class NotificationSender {

    public void sendEmailWithPayslip(Staff staff, YearMonth yearMonth) {
        // sends a payslip to given staff member
    }

    public void sendEmailWithMonthSummary(MedicalDoctor medicalDoctor, YearMonth yearMonth) {
        // sends report about patients treated by doctor in given month of the year
    }

    public void sendEmergencySms(MedicalDoctor medicalDoctor, String text) {
        // sends SMS to given staff member with provided text
        new SmsGatewayImpl().send(medicalDoctor.getPhoneNumber(), text);
    }

}
