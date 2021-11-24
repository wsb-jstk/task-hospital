package com.capgemini.task.hospital.service;

import com.capgemini.task.hospital.domain.staff.MedicalDoctor;
import com.capgemini.task.hospital.domain.staff.Staff;
import com.external.vendor.sms.SmsGateway;

import java.time.YearMonth;

public class NotificationSenderImpl implements NotificationSender {

    private final SmsGateway smsGateway;

    public NotificationSenderImpl(SmsGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

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
        smsGateway.send(medicalDoctor.getPhoneNumber(), text);
    }

}
