package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.repository.PharmacyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacyServiceImpl implements PharmacyService{


    private final PharmacyRepository repository;

    @Autowired
    public PharmacyServiceImpl(PharmacyRepository repository){this.repository = repository;}



    @Override
    public Pharmacy save(Pharmacy pharmacy) {return this.repository.save(pharmacy);}

    @Override
    public Pharmacy read(String s) {return this.repository.findById(s).orElse(null);}

    @Override
    public boolean delete(String s) {
        if (this.repository.existsById(s)) {
            this.repository.deleteById(s);
            return true;
        }
        return false;
    }

    @Override
    public void deleteById(String id) {}

    @Override
    public Optional<Pharmacy> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Pharmacy> findAll() {
        return null;
    }
}

