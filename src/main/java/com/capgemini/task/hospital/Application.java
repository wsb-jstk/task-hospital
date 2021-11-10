package com.capgemini.task.hospital;

import com.capgemini.task.hospital.domain.DocumentId;
import com.capgemini.task.hospital.domain.HospitalWard;
import com.capgemini.task.hospital.domain.Nationality;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        HospitalWard intensiveCareUnit = new HospitalWard("intensive care unit", 20, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard clinic = new HospitalWard("clinic", 10, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard infertilityUnit = new HospitalWard("infertility unit", 15, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard deliveryRoom = new HospitalWard("delivery room", 15, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard isolationWard = new HospitalWard("isolation ward", 0, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        Map<String, HospitalWard> wards = createMap(intensiveCareUnit, clinic, infertilityUnit, deliveryRoom, isolationWard);
        Hospital hospitalService = new Hospital(wards);

        // pierwszy pacjent do oddziału, na którym jest miejsce
        boolean result1 = hospitalService.admitPatient("intensive care unit", "ból gardła",
                LocalDate.of(2021, 1, 1), "Jan", "Kowalski",
                LocalDate.of(1990, 1, 1),
                new DocumentId("driving license", "AAAA"), 180, 75, Nationality.POLISH);
        LOG.info("Jan Kowalski został przyjęty? {}", result1);

        // powracający pacjent
        boolean result2 = hospitalService.admitPatient("intensive care unit", "ból brzucha",
                LocalDate.of(2021, 11, 10), "Jan", "Kowalski",
                LocalDate.of(1990, 1, 1),
                new DocumentId("driving license", "AAAA"), 180, 75, Nationality.POLISH);
        LOG.info("Jan Kowalski został przyjęty? {}", result2);

        // brak miejsc
        boolean result3 = hospitalService.admitPatient("isolation ward", "zarażona wirusem",
                LocalDate.of(2021, 11, 10), "Joanna", "Kowalska",
                LocalDate.of(1970, 1, 1),
                new DocumentId("driving license", "BBBB"), 165, 75, Nationality.POLISH);
        LOG.info("Joanna Kowalska została przyjęta? {}", result3);

        // nieznany oddział
        boolean result4 = hospitalService.admitPatient("Hogwart", "potrafi czarować",
                LocalDate.of(2021, 11, 10), "Monika", "Żuk",
                LocalDate.of(1980, 1, 1),
                new DocumentId("driving license", "CCCC"), 176, 70, Nationality.POLISH);
        LOG.info("Monika Żuk została przyjęta? {}", result4);
    }

    private static Map<String, HospitalWard> createMap(HospitalWard... wards) {
        return Arrays.stream(wards).collect(Collectors.toMap(HospitalWard::getName, Function.identity()));
    }

}
