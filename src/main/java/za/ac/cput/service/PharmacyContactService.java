package za.ac.cput.service;

import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.PharmacyContact;

import java.util.List;
import java.util.Optional;

public interface PharmacyContactService extends IService<PharmacyContact, String>{
    void deleteById(String id);
    Optional<Pharmacy> findById(String id);
    List<Pharmacy> findAll();
}
