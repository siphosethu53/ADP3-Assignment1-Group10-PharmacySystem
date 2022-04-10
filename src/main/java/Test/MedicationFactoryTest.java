package Test;

import Entity.Medication;
import Factory.MedicationFactory;
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