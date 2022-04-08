package Factory;

import Entity.Prescription;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrescriptionFactoryTest {

    @Test
    public void Test(){
        Prescription prescription = PrescriptionFactory.createPrescription(2, 2, "Pre-compounding prescription", 7);
        assertNotNull(prescription);
    }

}