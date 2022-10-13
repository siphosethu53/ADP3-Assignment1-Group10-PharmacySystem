package za.ac.cput.service;

import za.ac.cput.domain.Pharmacy;

import java.util.List;
import java.util.Optional;

public interface PharmacyService extends IService<Pharmacy, String> {
    void deleteById(String id);
    Optional<Pharmacy> findById(String id);
    List<Pharmacy> findAll();

}
