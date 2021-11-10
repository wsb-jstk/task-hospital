package com.capgemini.task.hospital.domain;

import java.util.Objects;

public class DocumentId {

    private final String documentType;
    private final String serialNumber;

    public DocumentId(String documentType, String serialNumber) {
        this.documentType = documentType;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocumentId)) return false;
        DocumentId that = (DocumentId) o;
        return Objects.equals(documentType, that.documentType) && Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentType, serialNumber);
    }
}
