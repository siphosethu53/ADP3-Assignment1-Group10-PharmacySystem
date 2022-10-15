package za.ac.cput.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Medication;
import za.ac.cput.factory.MedicationFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MedicationControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private MedicationController medicationController;

    @Autowired
    private TestRestTemplate restTemplate;

    private Medication medication;

    private String baseUrl;

    @BeforeEach
    void setUp() {
        this.medication = MedicationFactory.createMedication("2","Allergex", "Adcock","7");
        this.baseUrl = "http://localhost:" + this.port + "/PharmacySystem/medication";
    }

    @Test
    void getAllMedication() {
        String url = baseUrl + "/all";
        System.out.println(url);
        ResponseEntity<Medication[]> response=
                this.restTemplate.getForEntity(url,Medication[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                ()->assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()->assertTrue(response.getBody().length==1)
        );
    }

    @Test
    void readMedication() {
    }

    @Test
    void saveMedication() {
    }

    @Test
    void updateMedication() {
    }

    @Test
    void deleteMedication() {
    }
}