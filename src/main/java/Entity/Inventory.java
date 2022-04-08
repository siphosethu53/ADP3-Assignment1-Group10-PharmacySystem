/**
 * Author: Siphosethu Feni
 * Inventory.java
 */
package Entity;

public class Inventory {
    private int inventoryID, tableStockAmount, medicineStockAmount;
    private String medicationID;


    public Inventory(int inventoryID, String medicationID, int tableStockAmount, int medicineStockAmount) {
        this.inventoryID = inventoryID;
        this.medicationID = medicationID;
        this.tableStockAmount = tableStockAmount;
        this.medicineStockAmount = medicineStockAmount;
    }

    private Inventory(Builder builder)
    {
        this.inventoryID = inventoryID;
        this.medicationID = medicationID;
        this.tableStockAmount = tableStockAmount;
        this.medicineStockAmount = medicineStockAmount;

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

        public Builder setMedicineStockAmount(String MedicineStockAmount) {
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


        @Override
        public String toString() {
            return "Builder{" +
                    "inventoryID='" + inventoryID + '\'' +
                    ", medicationID='" + medicationID + '\'' +
                    ", tableStockAmount='" + tableStockAmount + '\'' +
                    ", medicineStockAmount='" + medicineStockAmount + '\'' +
                    '}';
        }
    }

}
