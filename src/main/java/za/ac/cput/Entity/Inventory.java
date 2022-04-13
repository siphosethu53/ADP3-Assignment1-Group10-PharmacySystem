/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  *  Group: 10
 * Inventory.java
 */
package za.ac.cput.Entity;

public class Inventory {
    private int inventoryID, tableStockAmount, medicineStockAmount;
    private String medicationID;



    private Inventory(Builder builder)
    {
        this.inventoryID = builder.inventoryID;
        this.medicationID = builder.medicationID;
        this.tableStockAmount = builder.tableStockAmount;
        this.medicineStockAmount = builder.medicineStockAmount;

    }

    public int getInventoryID() {
        return inventoryID;
    }

    public String getMedicationID() {
        return medicationID;
    }

    public int getTableStockAmount() {
        return tableStockAmount;
    }

    public int getMedicineStockAmount() {
        return medicineStockAmount;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "inventoryID='" + inventoryID + '\'' +
                ", medicationID='" + medicationID + '\'' +
                ", tableStockAmount='" + tableStockAmount + '\'' +
                ", medicineStockAmount='" + medicineStockAmount + '\'' +
                '}';
    }

    public static class Builder {

        private int inventoryID, tableStockAmount, medicineStockAmount;
        private String medicationID;


        public Builder setInventory(int inventoryID) {
            this.inventoryID = inventoryID;
            return this;
        }

        public Builder setMedicationID(String MedicationID) {
            this.medicationID = medicationID;
            return this;
        }

        public Builder setTableStockAmount(int tableStockAmount) {
            this.tableStockAmount = tableStockAmount;
            return this;
        }

        public Builder setMedicineStockAmount(int MedicineStockAmount) {
            this.medicineStockAmount = medicineStockAmount;
            return this;
        }

        public Inventory build(){

            return new Inventory(this);
        }

        public Builder copy(Inventory I){
            this.inventoryID = I.inventoryID;
            this.medicationID = I.medicationID;
            this.tableStockAmount = I.tableStockAmount;
            this.medicineStockAmount = I.medicineStockAmount;
            return this;
        }



}

}
