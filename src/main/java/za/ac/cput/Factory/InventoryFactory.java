/*
 *  Name: Siphosethu
 *  Student Number: 217237614
 *  Group: 10
 *
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Inventory;
import za.ac.cput.Util.SiphosethuHelper;

public class InventoryFactory {
    public static Inventory createAppointment( String medicationID, int tableStockAmount,
                                              int medicineStockAmount) {


        int inventoryID = SiphosethuHelper.generateID();
        Inventory Invent = new Inventory.Builder()
                .setInventory(inventoryID)
                .setMedicationID(medicationID)
                .setTableStockAmount(tableStockAmount)
                .setMedicineStockAmount(medicineStockAmount)
                .build();
       return Invent;
    }
}
