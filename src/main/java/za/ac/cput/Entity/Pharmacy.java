package za.ac.cput.Entity;

/* Pharmacy.java
   Entity for the Pharmacy
   Author: Waseem Dollie (216040566)
   Date: 5 April 2022
*/

public class Pharmacy {
    private String pharmID;
    private int cashierID;
    private String pharmName;
    private String pharmAddress;
    private String pharmContact;
    private int inventoryID;

    private Pharmacy (){}
    //Insert private constructor
    private Pharmacy (Pharmacy.Builder builder){
        this.pharmID=builder.pharmID;
        this.cashierID=builder.cashierID;
        this.pharmName=builder.pharmName;
        this.pharmAddress=builder.pharmAddress;
        this.pharmContact=builder.pharmContact;
        this.inventoryID=builder.inventoryID;
    }


    public String getPharmID() {
        return pharmID;
    }

    public int getCashierID() {
        return cashierID;
    }

    public String getPharmName() {
        return pharmName;
    }

    public String getPharmAddress() {
        return pharmAddress;
    }

    public String getPharmContact() {
        return pharmContact;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "pharmID=" + pharmID +
                ", cashierID=" + cashierID +
                ", pharmName='" + pharmName + '\'' +
                ", pharmAddress='" + pharmAddress + '\'' +
                ", pharmContact='" + pharmContact + '\'' +
                ", inventoryID=" + inventoryID +
                '}';
    }

    public static class Builder{
        private String pharmID;
        private int cashierID;
        private String pharmName;
        private String pharmAddress;
        private String pharmContact;
        private int inventoryID;

        public Builder setPharmID(String pharmID) {
            this.pharmID = pharmID;
            return this;
        }

        public Builder setCashierID(int cashierID) {
            this.cashierID = cashierID;
            return this;
        }

        public Builder setPharmName(String pharmName) {
            this.pharmName = pharmName;
            return this;
        }

        public Builder setPharmAddress(String pharmAddress) {
            this.pharmAddress = pharmAddress;
            return this;
        }

        public Builder setPharmContact(String pharmContact) {
            this.pharmContact = pharmContact;
            return this;
        }

        public Builder setInventoryID(int inventoryID) {
            this.inventoryID = inventoryID;
            return this;
        }

        public Pharmacy.Builder copy (Pharmacy pharmacy){
            this.pharmID=pharmacy.pharmID;
            this.cashierID=pharmacy.cashierID;
            this.pharmName=pharmacy.pharmName;
            this.pharmAddress=pharmacy.pharmAddress;
            this.pharmContact=pharmacy.pharmContact;
            this.inventoryID=pharmacy.inventoryID;
            return this;
        }
        public Pharmacy build (){
            return new Pharmacy(this);
        }

    }

}
