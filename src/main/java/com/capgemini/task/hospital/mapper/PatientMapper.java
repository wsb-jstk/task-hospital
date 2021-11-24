package com.capgemini.task.hospital.mapper;

import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.Patient;
import com.capgemini.task.hospital.domain.PatientRegistrationInfo;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * For sake of the example - using a utility class (only static methods)
 */
public final class PatientMapper {

    private PatientMapper() {
    }

    public static Patient map(PatientRegistrationInfo info) {
        return new Patient(info.getFirstName(), info.getLastName(), info.getBirthDate(), setOf(info.getDocument()), info.getHeight(), info.getWeight(), info.getNationality());
    }

    /**
     * Starting from JDK11, it has Set.of() to create unmodifiable set
     */
    private static Set<DocumentId> setOf(DocumentId... documents) {
        return Arrays.stream(documents).collect(Collectors.toSet());
    }

}
