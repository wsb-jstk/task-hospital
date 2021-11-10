package com.capgemini.task.hospital.domain;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Patient {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<DocumentId> documents = new HashSet<>();
    private LocalDate deathDate;
    private int height;
    private int weight;
    private Nationality nationality;

    private Patient father;
    private Patient mother;
    private Set<Patient> siblings;

    private List<HospitalRecord> hospitalRecords = new ArrayList<>();

    public Patient(String firstName, String lastName, LocalDate birthDate, Set<DocumentId> documents, int height, int weight, Nationality nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.documents.addAll(documents);
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return documents.stream().anyMatch(d -> patient.documents.contains(d));
    }

    @Override
    public int hashCode() {
        return Objects.hash(documents.stream().sorted().collect(Collectors.toList()));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<DocumentId> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<DocumentId> documents) {
        this.documents = documents;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Patient getFather() {
        return father;
    }

    public void setFather(Patient father) {
        this.father = father;
    }

    public Patient getMother() {
        return mother;
    }

    public void setMother(Patient mother) {
        this.mother = mother;
    }

    public Set<Patient> getSiblings() {
        return siblings;
    }

    public void setSiblings(Set<Patient> siblings) {
        this.siblings = siblings;
    }

    public List<HospitalRecord> getHospitalRecords() {
        return hospitalRecords;
    }

    public void setHospitalRecords(List<HospitalRecord> hospitalRecords) {
        this.hospitalRecords = hospitalRecords;
    }
}

