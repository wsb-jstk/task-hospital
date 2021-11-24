package com.capgemini.task.hospital;

import com.capgemini.task.hospital.domain.Department;
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
        HospitalWard intensiveCareUnit = new HospitalWard(Department.INTENSIVE_CARE_UNIT, 20, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard clinic = new HospitalWard(Department.CLINIC, 10, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard infertilityUnit = new HospitalWard(Department.INFERTILITY_CLINIC, 15, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard deliveryRoom = new HospitalWard(Department.DELIVERY_ROOM, 15, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        HospitalWard isolationWard = new HospitalWard(Department.ISOLATION_WARD, 0, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        Map<Department, HospitalWard> wards = createMap(intensiveCareUnit, clinic, infertilityUnit, deliveryRoom, isolationWard);
        Hospital hospitalService = new Hospital(wards);

        // pierwszy pacjent do oddziału, na którym jest miejsce
        boolean result1 = hospitalService.admitPatient(Department.INTENSIVE_CARE_UNIT, "ból gardła",
                LocalDate.of(2021, 1, 1), "Jan", "Kowalski",
                LocalDate.of(1990, 1, 1),
                new DocumentId("driving license", "AAAA"), 180, 75, Nationality.POLISH);
        LOG.info("Jan Kowalski został przyjęty? {}", result1);

        // powracający pacjent
        boolean result2 = hospitalService.admitPatient(Department.INTENSIVE_CARE_UNIT, "ból brzucha",
                LocalDate.of(2021, 11, 10), "Jan", "Kowalski",
                LocalDate.of(1990, 1, 1),
                new DocumentId("driving license", "AAAA"), 180, 75, Nationality.POLISH);
        LOG.info("Jan Kowalski został przyjęty? {}", result2);

        // brak miejsc
        boolean result3 = hospitalService.admitPatient(Department.ISOLATION_WARD, "zarażona wirusem",
                LocalDate.of(2021, 11, 10), "Joanna", "Kowalska",
                LocalDate.of(1970, 1, 1),
                new DocumentId("driving license", "BBBB"), 165, 75, Nationality.POLISH);
        LOG.info("Joanna Kowalska została przyjęta? {}", result3);

        // nieznany oddział - after refactor of ward's name (String -> enum) I'm not able to do it
//        boolean result4 = hospitalService.admitPatient("Hogwart", "potrafi czarować",
//                LocalDate.of(2021, 11, 10), "Monika", "Żuk",
//                LocalDate.of(1980, 1, 1),
//                new DocumentId("driving license", "CCCC"), 176, 70, Nationality.POLISH);
//        LOG.info("Monika Żuk została przyjęta? {}", result4);
    }

    private static Map<Department, HospitalWard> createMap(HospitalWard... wards) {
        return Arrays.stream(wards).collect(Collectors.toMap(HospitalWard::getType, Function.identity()));
    }

}
