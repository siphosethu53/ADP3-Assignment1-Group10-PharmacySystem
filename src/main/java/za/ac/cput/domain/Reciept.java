package za.ac.cput.domain;
import java.util.Date;
/* Reciept.java
 * Entity for the Reciept
 * Thabiso Matsaba 220296006
 * 05 April 2022
 */

public class Reciept {

    private int recieptID;
    private int prescriptionID;
    private Date recieptDate;

    private Reciept(Builder builder){
        this.recieptID = builder.recieptID;
        this.prescriptionID = builder.prescriptionID;
        this.recieptDate = builder.recieptDate;
    }

    public int getRecieptID() {
        return recieptID;
    }

    public void setRecieptID(int recieptID) {
        this.recieptID = recieptID;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public Date getRecieptDate() {
        return recieptDate;
    }

    public void setRecieptDate(Date recieptDate) {
        this.recieptDate = recieptDate;
    }

    @Override
    public String toString() {
        return "Reciept{" +
                "recieptID=" + recieptID +
                ", prescriptionID=" + prescriptionID +
                ", recieptDate=" + recieptDate +
                '}';
    }

    public static class Builder {
        private int recieptID;
        private int prescriptionID;
        private Date recieptDate;

        public Builder setRecieptID(int recieptID) {
            this.recieptID = recieptID;
            return this;
        }

        public Builder setPrescriptionID(int prescriptionID) {
            this.prescriptionID = prescriptionID;
            return this;
        }

        public Builder setRecieptDate(Date recieptDate) {
            this.recieptDate = recieptDate;
            return this;
        }

        public Builder copy(Reciept reciept) {
            this.recieptID = reciept.recieptID;
            this.prescriptionID = reciept.prescriptionID;
            this.recieptDate = reciept.recieptDate;
            return this;

        }

        public Reciept build() {
            return new Reciept(this);
        }
    }
}

