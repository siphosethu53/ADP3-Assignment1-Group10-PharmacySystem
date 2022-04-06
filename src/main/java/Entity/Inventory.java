/**
 * Author: Robyn White (218034555)
 * Inventory.java
 */
package Entity;

public class Inventory {
    private String inventoryID, medicationID, tableStockAmount, medicineStockAmount;

    public Inventory(String inventoryID, String medicationID, String tableStockAmount, String medicineStockAmount) {
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

    public String getInventoryID() {
        return inventoryID;
    }

    public String getMedicationID() {
        return medicationID;
    }

    public String getTableStockAmount() {
        return tableStockAmount;
    }

    public String getMedicineStockAmount() {
        return medicineStockAmount;
    }


    public static class Builder {

        private String inventoryID, medicationID, tableStockAmount, medicineStockAmount;


        public Builder setInventory(String inventoryID) {
            this.inventoryID = inventoryID;
            return this;
        }

        public Builder setMedicationID(String MedicationID) {
            this.medicationID = medicationID;
            return this;
        }

        public Builder setTableStockAmount(String tableStockAmount) {
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
