package com.capgemini.task.hospital;

import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.Nationality;
import com.capgemini.task.hospital.domain.Patient;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Provides methods to work with {@link Patient patients} in the application.
 * Provides a single-point-of-truth for information about {@link Patient patients}
 */
public class Patients {

    private static final Set<Patient> PATIENTS = new HashSet<>();

    public static boolean isKnownPatient(DocumentId document) {
        return find(document) != null;
    }

    public static Patient createPatient(String firstName, String lastName, LocalDate birthDate, DocumentId document, int height, int weight,
                                        Nationality nationality) {
        Patient patient = new Patient(firstName, lastName, birthDate, setOf(document), height, weight, nationality);
        PATIENTS.add(patient);
        return patient;
    }

    public static Patient find(DocumentId document) {
        return PATIENTS.stream()
                .filter(p -> p.getDocuments().contains(document))
                .findFirst()
                .orElse(null);
    }

    /**
     * Starting from JDK11, it has Set.of() to create unmodifiable set
     */
    private static Set<DocumentId> setOf(DocumentId... documents) {
        return Arrays.stream(documents).collect(Collectors.toSet());
    }

}
