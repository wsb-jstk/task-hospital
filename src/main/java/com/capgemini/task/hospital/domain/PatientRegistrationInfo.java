package com.capgemini.task.hospital.domain;

import java.time.LocalDate;

public class PatientRegistrationInfo {

    private final String symptoms;
    private final LocalDate localDate;

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final DocumentId document;
    private final int height;
    private final int weight;
    private final Nationality nationality;

    public PatientRegistrationInfo(String symptoms, String firstName, String lastName, LocalDate birthDate, DocumentId document, int height, int weight, Nationality nationality) {
        this.symptoms = symptoms;
        this.localDate = LocalDate.now();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.document = document;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public DocumentId getDocument() {
        return document;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
