package za.ac.cput.controller;
////
/* PharmacyContactControllerTest.java
ControllerTest for the PharmacyContact
Author: Waseem Dollie (216040566)
Date: 15 October 2022 */

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.PharmacyContact;
import za.ac.cput.factory.PharmacyContactFactory;
import za.ac.cput.factory.PharmacyFactory;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PharmacyContactControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private PharmacyContactController controller;

    @Autowired
    private TestRestTemplate restTemplate;
    private PharmacyContact pharmacyContact;
    private String baseUrl;

    @BeforeEach
    void setUp(){
        this.pharmacyContact = PharmacyContactFactory.build("123","0208348302","216040566@mycput.ac.za");
        this.baseUrl = "http://localhost:" + this.port + "/PharmacySystem/pharmacyContact/";
    }

    @Order(1)
    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<PharmacyContact> response = this.restTemplate
                .postForEntity(url, this.pharmacyContact, PharmacyContact.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Order(2)
    @Test
    void read() {
        String url = baseUrl + "read/" + this.pharmacyContact.getPharmId();
        System.out.println(url);
        ResponseEntity<PharmacyContact>response=
                this.restTemplate.getForEntity(url,PharmacyContact.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()->assertNotNull(response.getBody())
        );
    }

    @Order(4)
    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.pharmacyContact.getPharmId();
        System.out.println(url);
        this.restTemplate.delete(url,controller.delete(url));
    }

    @Order(3)
    @Test
    void findAll() {

        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<PharmacyContact[]>response=
                this.restTemplate.getForEntity(url,PharmacyContact[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                ()->assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()->assertTrue(response.getBody().length==1)
        );
    }
}
