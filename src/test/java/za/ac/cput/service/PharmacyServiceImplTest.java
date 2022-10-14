package za.ac.cput.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.factory.PharmacyFactory;
import za.ac.cput.repository.PharmacyRepository;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PharmacyServiceImplTest {
    private PharmacyServiceImpl pharmacyService;

    private static Pharmacy pharmacy = PharmacyFactory.build("123","DolliePharm","22", "32");

    @Mock
    PharmacyRepository pharmacyRepository;
    @BeforeEach
    void setUp() {
        pharmacyService = new PharmacyServiceImpl(pharmacyRepository);
    }

    @Test
    @Order(1)
    void save() {
        pharmacyService.save(pharmacy);
        ArgumentCaptor<Pharmacy> argumentCaptor = ArgumentCaptor.forClass(Pharmacy.class);
        verify(pharmacyRepository).save(argumentCaptor.capture());
        Pharmacy capturedPharmacy = argumentCaptor.getValue();
        assertThat(capturedPharmacy).isEqualTo(pharmacy);
        System.out.println(pharmacy);
    }

    @Test
    @Order(2)
    void read() {
        pharmacyService.read("123");
        verify(pharmacyRepository).findById(pharmacy.getPharmId());
        assertNotNull(pharmacy.getPharmId());
        System.out.println(pharmacy);
    }

    @Test
    @Order(4)
    void delete() {
        pharmacyService.delete("123");
        verify(pharmacyRepository).existsById(pharmacy.getPharmId());
        System.out.println("ID " + pharmacy.getPharmId() +" has been deleted");
    }

    @Test
    @Order(3)
    void getAll() {
        pharmacyService.getAll();
        verify(pharmacyRepository).findAll();
        System.out.println(pharmacy);
    }
}
