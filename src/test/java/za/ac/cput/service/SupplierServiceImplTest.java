/*SupplierServiceImplTest.java
 * Test Service class for Supplier
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
import za.ac.cput.domain.Supplier;
import za.ac.cput.factory.SupplierFactory;
import za.ac.cput.repository.SupplierRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SupplierServiceImplTest {
    private SupplierServiceImpl supplierService;

    private static Supplier supplier = SupplierFactory.createSupplier("7","ChemReact");

    @Mock
    SupplierRepository supplierRepository;
    @BeforeEach
    void setUp() {
        supplierService = new SupplierServiceImpl(supplierRepository);
    }

    @Test
    void save() {
        supplierService.save(supplier);
        ArgumentCaptor<Supplier> argumentCaptor = ArgumentCaptor.forClass(Supplier.class);
        verify(supplierRepository).save(argumentCaptor.capture());
        Supplier capturedSupplier = argumentCaptor.getValue();
        assertThat(capturedSupplier).isEqualTo(supplier);
        System.out.println(supplier);
    }

    @Test
    void read() {
        supplierService.read("7");
        verify(supplierRepository).findById(supplier.getSuppId());
        assertNotNull(supplier.getSuppId());
        System.out.println(supplier);
    }

    @Test
    void delete() {
        supplierService.delete("7");
        verify(supplierRepository).existsById(supplier.getSuppId());
        System.out.println("ID " + supplier.getSuppId() +" has been deleted");
    }

    @Test
    void getAll() {
        supplierService.getAll();
        verify(supplierRepository).findAll();
        System.out.println(supplier);
    }
}