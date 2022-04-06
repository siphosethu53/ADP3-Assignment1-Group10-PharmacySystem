package Factory;

import Entity.Medication;
import Entity.Supplier;
import Util.IlyaasHelper;

public class SupplierFactory {

    public static Supplier createSupplier(String SuppName, String SuppAddress, String SuppContact,String SuppEmail){
        int suppID = IlyaasHelper.MedId();
        Supplier supplier = new Supplier.Builder().suppId(suppID)
                .suppName(SuppName)
                .suppAddress(SuppAddress)
                .suppContact(SuppContact)
                .suppEmail(SuppEmail)
                .build();
        return supplier;
    }

}
