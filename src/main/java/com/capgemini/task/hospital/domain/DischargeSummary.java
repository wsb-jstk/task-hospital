package com.capgemini.task.hospital.domain;

import java.time.LocalDateTime;
import java.util.List;

class DischargeSummary {

    private LocalDateTime admissionDate;
    private LocalDateTime dischargeDate;

    private String diagnosis;
    private String treatment;
    private String description;
    private List<Diagnostic> diagnostics;

    private SystemUser author;

}
