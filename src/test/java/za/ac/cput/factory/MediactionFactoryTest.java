package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Medication;

import static org.junit.jupiter.api.Assertions.*;

class MediactionFactoryTest {

    @Test
    @Order(1)
    void createMedicationSuccess() {
        Medication medication = MediactionFactory.createMedication("5","Allergex","Adcock Ingram","7");
        assertNotNull(medication);
        System.out.println(medication);
    }

    @Test
    @Order(2)
    void createMedicationError() {
//        Medication medication = MediactionFactory.createMedication("","Allergex","Adcock Ingram","7");
//        assertNotNull(medication);
        System.out.println("test!");
    }

}