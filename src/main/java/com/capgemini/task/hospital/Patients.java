package com.capgemini.task.hospital;

import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.Patient;

import java.util.HashSet;
import java.util.Set;

/**
 * Provides methods to work with {@link Patient patients} in the application.
 * Provides a single-point-of-truth for information about {@link Patient patients}
 */
public class Patients {

    private static final Set<Patient> PATIENTS = new HashSet<>();

    public static boolean isKnownPatient(DocumentId document) {
        return find(document) != null;
    }

    public static Patient save(Patient patient) {
        PATIENTS.add(patient);
        return patient;
    }

    public static Patient find(DocumentId document) {
        return PATIENTS.stream()
                .filter(p -> p.getDocuments().contains(document))
                .findFirst()
                .orElse(null);
    }


}
