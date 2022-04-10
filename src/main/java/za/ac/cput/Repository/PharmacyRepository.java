package za.ac.cput.Repository;

/* PharmacyRepository.java
   Repository for the PharmacyRepository
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Pharmacy;

import java.util.HashSet;
import java.util.Set;

public class PharmacyRepository implements IPharmacyRepository{
    private static PharmacyRepository repository = null;
    private Set<Pharmacy> pharmacyDB = null;

    private PharmacyRepository() {
        pharmacyDB = new HashSet<Pharmacy>();
    }

    public static PharmacyRepository getRepository() {
        if (repository == null) {
            repository = new PharmacyRepository();
        }
        return repository;
    }

    @Override
    public Pharmacy create(Pharmacy pharmacy) {
        boolean success = pharmacyDB.add(pharmacy);
        if (!success)
            return null;
        return pharmacy;
    }

    @Override
    public Pharmacy read(String pharmID) {
        for (Pharmacy e : pharmacyDB) {
            if (e.getPharmID().equals(pharmID))
                return e;
        }
        return null;
    }

    @Override
    public Pharmacy update(Pharmacy pharmacy) {
        Pharmacy oldPharmacy = read(pharmacy.getPharmID());
        if (oldPharmacy != null){
            pharmacyDB.remove(oldPharmacy);
            pharmacyDB.add(pharmacy);
            return pharmacy;
        }
        return null;
    }

    @Override
    public boolean delete(String pharmID) {
        Pharmacy pharmacyToDelete = read(pharmID);
        if (pharmacyToDelete == null)
            return false;
        pharmacyDB.remove(pharmacyToDelete);
        return true;
    }

    @Override
    public Set<Pharmacy> getAll() {
        return pharmacyDB;
    }
}
