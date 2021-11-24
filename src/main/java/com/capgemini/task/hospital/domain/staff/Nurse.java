package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.Medicament;
import com.capgemini.task.hospital.domain.Patient;

public class Nurse extends Staff implements Injector {

    @Override
    public void doInjection(Patient patient, Medicament medicament) {
        // do injection
    }
}
