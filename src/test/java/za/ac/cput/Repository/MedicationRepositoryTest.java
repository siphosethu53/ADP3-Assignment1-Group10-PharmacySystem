package za.ac.cput.Repository;
/*MedicationRepositoryTest.java
Test for the Medication Repository
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Medication;
import za.ac.cput.Factory.MedicationFactory;
import za.ac.cput.Repository.MedicationRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class MedicationRepositoryTest {
    private static MedicationRepository repository = MedicationRepository.getRepository();
    private static Medication medication = MedicationFactory.createMedication("UUID","Paracetamol","Panado");

    @Test
    void a_create() {
        Medication created = repository.create(medication);
        assertEquals(medication.getMedId() , created.getMedId());
        System.out.print("Created : " + medication);
    }

    @Test
    void b_read() {
        Medication scan = repository.read(medication.getMedId());
        assertNotNull(scan);
        System.out.print("Read : " + scan );
    }

    @Test
    void c_update() {
        Medication updated = new Medication.Builder()
                .copy(medication)
                .suppId("Random")
                .medName("Paracetamol")
                .medManuf("ADCO")
                .build();
        assertNotNull(repository.update(updated));
        System.out.print("Updated : " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(medication.getMedId());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All : ");
        System.out.println(repository.getAll());
    }
}