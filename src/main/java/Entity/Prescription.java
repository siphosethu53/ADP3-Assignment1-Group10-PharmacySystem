/* Prescription.java
 Entity for the Prescription
 Author: Zaeem Petersen (219010145)
 Date: 05 April 2022
*/
package Entity;

public class Prescription {

    private int prescID;
    private int customerID;
    private String prescType;
    private int prescDoses;

    //private builder constructor
    private Prescription(Builder builder){
        this.prescID = builder.prescID;
        this.customerID = builder.customerID;
        this.prescType = builder.prescType;
        this.prescDoses = builder.prescDoses;
    }

    public int getPrescID() {
        return prescID;
    }

    public void setPrescID(int prescID) {
        this.prescID = prescID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPrescType() {
        return prescType;
    }

    public void setPrescType(String prescType) {
        this.prescType = prescType;
    }

    public int getPrescDoses() {
        return prescDoses;
    }

    public void setPrescDoses(int prescDoses) {
        this.prescDoses = prescDoses;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescID=" + prescID +
                ", customerID=" + customerID +
                ", prescType='" + prescType + '\'' +
                ", prescDoses=" + prescDoses +
                '}';
    }

    public static class Builder{
        private int prescID;
        private int customerID;
        private String prescType;
        private int prescDoses;

        public Builder setPrescID(int prescID) {
            this.prescID = prescID;
            return this;
        }

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setPrescType(String prescType) {
            this.prescType = prescType;
            return this;
        }

        public Builder setPrescDoses(int prescDoses) {
            this.prescDoses = prescDoses;
            return this;
        }

        public Builder copy(Prescription prescription){
            this.prescID = prescription.prescID;
            this.customerID = prescription.customerID;
            this.prescType = prescription.prescType;
            this.prescDoses = prescription.prescDoses;

            return this;
        }

        public Prescription build(){
            return new Prescription(this);
        }
    }
}
