package za.ac.cput.service;

import za.ac.cput.domain.SupplierContact;

import java.util.List;

public interface SupplierContactService extends IService<SupplierContact,String>{

    List<SupplierContact> getAll();

}
