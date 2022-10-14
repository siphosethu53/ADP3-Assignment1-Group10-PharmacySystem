package za.ac.cput.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.PharmacyContact;
import za.ac.cput.factory.PharmacyContactFactory;
import za.ac.cput.factory.PharmacyFactory;
import za.ac.cput.repository.PharmacyContactRepository;
import za.ac.cput.repository.PharmacyRepository;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PharmacyContactServiceImplTest {
    private PharmacyContactServiceImpl pharmacyContactService;

    private static PharmacyContact pharmacyContact = PharmacyContactFactory.build("123","0208348302","216040566@mycput.ac.za");

    @Mock
    PharmacyContactRepository pharmacyContactRepository;
    @BeforeEach
    void setUp() {
        pharmacyContactService = new PharmacyContactServiceImpl(pharmacyContactRepository);
    }

    @Test
    @Order(1)
    void save() {
        pharmacyContactService.save(pharmacyContact);
        ArgumentCaptor<PharmacyContact> argumentCaptor = ArgumentCaptor.forClass(PharmacyContact.class);
        verify(pharmacyContactRepository).save(argumentCaptor.capture());
        PharmacyContact capturedPharmacyContact = argumentCaptor.getValue();
        assertThat(capturedPharmacyContact).isEqualTo(pharmacyContact);
        System.out.println(pharmacyContact);
    }

    @Test
    @Order(2)
    void read() {
        pharmacyContactService.read("123");
        verify(pharmacyContactRepository).findById(pharmacyContact.getPharmId());
        assertNotNull(pharmacyContact.getPharmId());
        System.out.println(pharmacyContact);
    }

    @Test
    @Order(4)
    void delete() {
        pharmacyContactService.delete("123");
        verify(pharmacyContactRepository).existsById(pharmacyContact.getPharmId());
        System.out.println("ID " + pharmacyContact.getPharmId() +" has been deleted");
    }

    @Test
    @Order(3)
    void getAll() {
        pharmacyContactService.getAll();
        verify(pharmacyContactRepository).findAll();
        System.out.println(pharmacyContact);
    }
}
