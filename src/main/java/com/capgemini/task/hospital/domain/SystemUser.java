package com.capgemini.task.hospital.domain;

import java.time.LocalDateTime;

/**
 * User of the system, which is represented by unique {@link #login}
 */
class SystemUser {

    private String login;
    private String firstName;
    private String lastName;
    private LocalDateTime creationDate;

}
