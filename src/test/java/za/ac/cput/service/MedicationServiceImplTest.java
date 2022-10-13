/*MedicationServiceImplTest.java
 * Test Service class for Medication
 * Author: Ilyaas Davids (219466242)
 * Date: 13 Oct 2022
 */
package za.ac.cput.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.domain.Medication;
import za.ac.cput.factory.MedicationFactory;
import za.ac.cput.repository.MedicationRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MedicationServiceImplTest {
    private MedicationServiceImpl medicationService;

    private static Medication medication = MedicationFactory.createMedication("2","Allergex" , "Adcock Ingram","7");

    @Mock
    MedicationRepository medicationRepository;
    @BeforeEach
    void setUp() {
        medicationService = new MedicationServiceImpl(medicationRepository);
    }

    @Test
    void save() {
        medicationService.save(medication);
        ArgumentCaptor<Medication> argumentCaptor = ArgumentCaptor.forClass(Medication.class);
        verify(medicationRepository).save(argumentCaptor.capture());
        Medication capturedMedication = argumentCaptor.getValue();
        assertThat(capturedMedication).isEqualTo(medication);
        System.out.println(medication);
    }

    @Test
    void read() {
        medicationService.read("2");
        verify(medicationRepository).findById(medication.getMedId());
        assertNotNull(medication.getMedId());
        System.out.println(medication);
    }

    @Test
    void delete() {
        medicationService.delete("2");
        verify(medicationRepository).existsById(medication.getMedId());
        System.out.println("ID " + medication.getMedId() +" has been deleted");
    }

    @Test
    void getAll() {
        medicationService.getAll();
        verify(medicationRepository).findAll();
        System.out.println(medication);
    }
}