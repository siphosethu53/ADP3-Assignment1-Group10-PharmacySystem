package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Medication;

import static org.junit.jupiter.api.Assertions.*;

class MedicationFactoryTest {

    @Test
    @Order(1)
    void createMedication() {
            Medication medication = MedicationFactory.createMedication("5","Allergex","Adcock Ingram","");
            assertNotNull(medication);
            System.out.println(medication);
        }
    @Test
    @Order(1)
    void createMedicationError() {
        Medication medication = MedicationFactory.createMedication("5","","Adcock Ingram","");
        assertNotNull(medication);
        System.out.println(medication);
    }

    }

