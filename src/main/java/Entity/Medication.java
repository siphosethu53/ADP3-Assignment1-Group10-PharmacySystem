package Entity;

import java.util.jar.Attributes;

public class Medication {
    private int medId ;
    private int suppId ;
    private String medName;
    private String medManuf;
    private int medAmount;

    public int getMedId() {
        return medId;
    }

    public int getSuppId() {
        return suppId;
    }

    public String getMedName() {
        return medName;
    }

    public String getMedManuf() {
        return medManuf;
    }

    public int getMedAmount() {
        return medAmount;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public void setSuppId(int suppId) {
        this.suppId = suppId;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public void setMedManuf(String medManuf) {
        this.medManuf = medManuf;
    }

    public void setMedAmount(int medAmount) {
        this.medAmount = medAmount;
    }



    private Medication(Builder builder){
        this.medId = builder.medId;
        this.suppId = builder.suppId;
        this.medName = builder.medName;
        this.medManuf = builder.medManuf;
        this.medAmount = builder.medAmount;
    }

    public static class Builder{
        private int medId ;
        private int suppId ;
        private String medName;
        private String medManuf;
        private int medAmount;

        public Builder medId(int medId){
            this.medId = medId;
            return this;
        }

        public Builder suppId(final int suppId){
            this.suppId = suppId;
            return this;
        }

        public Builder medName(final String medName){
            this.medName = medName;
            return this;
        }

        public Builder medManuf(final String medManuf){
            this.medManuf = medManuf;
            return this;
        }

        public Builder medAmount(final int medAmount){
            this.medAmount = medAmount;
            return this;
        }

        public Medication build(){
            return new Medication(this);
        }

    }
//
//    public static void main(String[] args){
//        Medication medication = new Builder().medName("Allegex").medAmount(5).build();
//        System.out.print(medication.getMedName() +" "+ medication.getMedAmount());
//    }

}
