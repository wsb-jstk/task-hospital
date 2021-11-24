package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.Medicament;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.Qualification;

import java.util.Set;

public interface Staff {

    Set<Qualification> getQualifications();

    /**
     * Perform actions, which will lead to examination, heal and at the end - release given {@link Patient} from the hospital in good condition.
     */
    void heal(Patient patient);

    /**
     * Apply {@link Medicament} to {@link Patient}
     */
    void doInjection(Patient patient, Medicament medicament);

    void clean(HospitalWard hospitalWard);

    void hireStaff(Staff staff);

    void terminateContract(Staff staff);

}
