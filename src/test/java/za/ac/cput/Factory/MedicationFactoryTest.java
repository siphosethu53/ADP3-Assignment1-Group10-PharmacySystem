package za.ac.cput.Factory;
/*MedicationFactoryTest.java
Test for the Medication Factory
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Medication;
import za.ac.cput.Factory.MedicationFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicationFactoryTest {

    @Test
    public void test() {
        Medication medication = MedicationFactory.createMedication("1","Loratadine","Allergex");
        assertNotNull(medication);
        System.out.print(medication.toString());
    }
}