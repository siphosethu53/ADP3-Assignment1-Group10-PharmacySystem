package za.ac.cput.Factory;

/* PharmacyFactoryTest.java
   Test for the PharmacyFactorTest
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Pharmacy;
import za.ac.cput.Factory.PharmacyFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmacyFactoryTest {
    @Test
    public void createPharmacy() {
        Pharmacy pharmacy = PharmacyFactory.createPharmacy
                (1, "Nawaaz Bai", "Rockyway", "0794236652", 1);
        System.out.println(pharmacy);
        assertNotNull(pharmacy);
    }

}