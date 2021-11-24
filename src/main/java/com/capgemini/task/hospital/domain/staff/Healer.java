package com.capgemini.task.hospital.domain.staff;

import com.capgemini.task.hospital.domain.Patient;

public interface Healer {

    /**
     * Perform actions, which will lead to examination, heal and at the end - release given {@link Patient} from the hospital in good condition.
     */
    void heal(Patient patient);

}
