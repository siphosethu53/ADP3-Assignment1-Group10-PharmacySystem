package za.ac.cput.Repository;
/*ISupplierRepository.java
Interface Repository for the Supplier
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Supplier;

import java.util.Set;

public interface ISupplierRepository extends IRepository<Supplier,String> {
    public Set<Supplier> getAll();
}
