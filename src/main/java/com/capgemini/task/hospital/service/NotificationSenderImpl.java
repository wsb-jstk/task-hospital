package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Staff;
import com.external.vendor.sms.SmsGatewayImpl;

import java.time.YearMonth;

public class NotificationSenderImpl implements NotificationSender {

    @Override
    public void sendEmailWithPayslip(Staff staff, YearMonth yearMonth) {
        // logic
    }

    @Override
    public void sendEmailWithMonthSummary(MedicalDoctor medicalDoctor, YearMonth yearMonth) {
        // logic
    }

    @Override
    public void sendEmergencySms(MedicalDoctor medicalDoctor, String text) {
        // sends SMS to given staff member with provided text
        new SmsGatewayImpl().send(medicalDoctor.getPhoneNumber(), text);
    }

}
