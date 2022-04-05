package Entity;

import java.util.jar.Attributes;

public class Medication {
    private final int medId ;
    private final int suppId ;
    private final String medName;
    private final String medManuf;
    private final int medAmount;

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

        public Builder medId(final int medId){
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
