package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.HospitalWard;

public interface Cleaner {

    /**
     * Perform cleaning work on given {@link HospitalWard}
     */
    void clean(HospitalWard hospitalWard);

}
