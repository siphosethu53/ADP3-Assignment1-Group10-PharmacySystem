package za.ac.cput.Repository;
/*SupplierRepository.java
Repository Class for the Supplier
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Supplier;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepository implements ISupplierRepository{

    private static SupplierRepository repository = null;
    private Set<Supplier> supplierDB = null;

    private SupplierRepository(){
        supplierDB = new HashSet<Supplier>();
    }

    public static SupplierRepository getRepository(){
        if (repository == null){
            repository = new SupplierRepository();
        }
        return repository;
    }

    @Override
    public Supplier create(Supplier supplier) {
        boolean success = supplierDB.add(supplier);
                if(!success) {
                    return null;
                }
        return supplier;
    }

    @Override
    public Supplier read(String suppId) {
        Supplier supplier = supplierDB.stream()
                .filter(e -> e.getSuppId().equals(suppId))
                .findAny()
                .orElse(null);
        return supplier;
    }

    @Override
    public Supplier update(Supplier supplier) {
        Supplier oldSuppID = read(supplier.getSuppId());
        if (oldSuppID != null) {
            supplierDB.remove(oldSuppID);
            supplierDB.add(supplier);
            return supplier;
        }
        return null;
    }

    @Override
    public boolean delete(String suppId) {
        Supplier SuppToDelete = read(suppId);
        if(SuppToDelete == null) {
            return false;
        }
        supplierDB.remove(SuppToDelete);
        return true;
    }

    @Override
    public Set<Supplier> getAll() {
        return supplierDB;
    }
}
