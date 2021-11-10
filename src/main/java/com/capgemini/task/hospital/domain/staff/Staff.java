package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.Qualification;

import java.util.Set;

public interface Staff {

    Set<Qualification> getQualifications();

    void treat(Patient patient);

    void doInjection(Patient patient);

    void clean(HospitalWard hospitalWard);

    void hireStaff(Staff staff);

    void terminateContract(Staff staff);

}
