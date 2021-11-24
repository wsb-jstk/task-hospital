package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.Medicament;
import com.capgemini.task.hospital.domain.Patient;

public interface Injector {

    /**
     * Apply {@link Medicament} to {@link Patient}
     */
    void doInjection(Patient patient, Medicament medicament);

}
