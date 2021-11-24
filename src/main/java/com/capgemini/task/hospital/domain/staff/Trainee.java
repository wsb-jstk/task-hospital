package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.Medicament;
import com.capgemini.task.hospital.domain.Patient;

public class Trainee extends Staff implements Healer, Injector {

    @Override
    public void heal(Patient patient) {
        // treat
    }

    @Override
    public void doInjection(Patient patient, Medicament medicament) {
        // do injection
    }

}
