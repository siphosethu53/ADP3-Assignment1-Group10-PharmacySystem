package Factory;

/* PharmacyFactory.java
   Factory for the PharmacyFactory
   Author: Waseem Dollie (216040566)
   Date: 7 April 2022
*/

import Entity.Pharmacy;
import Util.WaseemHelper;

public class PharmacyFactory {
    public static Pharmacy createPharmacy(int cashierID, String pharmName, String pharmAddress, String pharmContact, int supplierID)
    {
        String pharmacyNumber= WaseemHelper.pharmID();
        Pharmacy pharmacy=new Pharmacy.Builder().setPharmID(pharmacyNumber)
                .setCashierID(cashierID)
                .setPharmName(pharmName)
                .setPharmAddress(pharmAddress)
                .setPharmContact(pharmContact)
                .setSupplierID(supplierID)
                .build();
        return pharmacy;
    }
}

