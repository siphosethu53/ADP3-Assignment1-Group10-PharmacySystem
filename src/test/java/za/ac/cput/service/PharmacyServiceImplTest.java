package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.PharmacyContact;
import za.ac.cput.factory.PharmacyContactFactory;
import za.ac.cput.factory.PharmacyFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PharmacyServiceImplTest {

    private final PharmacyContact pharmacyContact = PharmacyContactFactory.build("123", "0208348302","216040566");
    private final Pharmacy pharmacy = PharmacyFactory.build("123","DolliePharm", "22","32");

    @Autowired
    private PharmacyService pharmacyService;

    @Order(1)
    @Test
    void save(){
        Pharmacy saved = this.pharmacyService.save(this.pharmacy);
        assertEquals(this.pharmacy, saved);
        System.out.println(saved);
    }

    @Order(2)
    @Test
    void read(){
        Optional<Pharmacy> read = Optional.ofNullable(this.pharmacyService.read(this.pharmacy.getPharmId()));
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertEquals(this.pharmacy,read.get())
        );
    }

    @Order(3)
    @Test
    void findAll(){
        List<Pharmacy> pharmacyList = this.pharmacyService.findAll();
        assertEquals(1,pharmacyList.size());
    }

    @Order(5)
    @Test
    void delete(){
        this.pharmacyService.deleteById(this.pharmacy.getPharmId());
        List<Pharmacy> pharmacyList = this.pharmacyService.findAll();
        assertEquals(0,pharmacyList.size());
    }

    @Order(4)
    @Test
    void findById(){
        Optional<Pharmacy> pharmacyList = this.pharmacyService.findById(pharmacy.getPharmId());
        PharmacyContact nameByEmail = pharmacyList.get().getPharmacyContact();
        assertAll(
                () -> assertNotNull(nameByEmail),
                () -> assertEquals(pharmacyContact, nameByEmail)
        );

    }
}
