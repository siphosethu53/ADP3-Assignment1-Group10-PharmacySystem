package za.ac.cput.Factory;
/*SupplierFactory.java
Factory for the Medication
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Supplier;
import za.ac.cput.Util.IlyaasHelper;

public class SupplierFactory {

    public static Supplier createSupplier(String SuppName, String SuppAddress, String SuppContact,String SuppEmail){
        String sID = IlyaasHelper.GenerateId();

        if (IlyaasHelper.isNullorEmpty(SuppName)||IlyaasHelper.isNullorEmpty(SuppAddress)||IlyaasHelper.isNullorEmpty(SuppContact)) {
            return null;
        }

        if(!IlyaasHelper.isValid(SuppEmail)){
            return null;
        }

        Supplier supplier = new Supplier.Builder().suppId(sID)
                .suppName(SuppName)
                .suppAddress(SuppAddress)
                .suppContact(SuppContact)
                .suppEmail(SuppEmail)
                .build();
        return supplier;
    }

}
