package za.ac.cput.service;

import za.ac.cput.domain.Supplier;

import java.util.List;

public interface SupplierService extends IService<Supplier,String>{

    List<Supplier> getAll();

}
