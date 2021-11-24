package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.Patient;

public class MedicalDoctor extends Staff implements Healer {

    private String phoneNumber;

    @Override
    public void heal(Patient patient) {
        // treat
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
