package Entity;

public class Medication {
    private String medId ;
    private String suppId ;
    private String medName;
    private String medManuf;
    private int medAmount;

    public String getMedId() {
        return medId;
    }

    public String getSuppId() {
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

    public void setMedId(String medId) {
        this.medId = medId;
    }

    public void setSuppId(String suppId) {
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

    @Override
    public String toString() {
        return "Medication{" +
                "medId='" + medId + '\'' +
                ", suppId='" + suppId + '\'' +
                ", medName='" + medName + '\'' +
                ", medManuf='" + medManuf + '\'' +
                ", medAmount=" + medAmount +
                '}';
    }

    private Medication(Builder builder){
        this.medId = builder.medId;
        this.suppId = builder.suppId;
        this.medName = builder.medName;
        this.medManuf = builder.medManuf;
        this.medAmount = builder.medAmount;
    }


    public static class Builder{
        private String medId ;
        private String suppId ;
        private String medName;
        private String medManuf;
        private int medAmount;

        public Builder medId (String medId){
            this.medId = medId;
            return this;
        }

        public Builder suppId(String suppId){
            this.suppId = suppId;
            return this;
        }

        public Builder medName(String medName){
            this.medName = medName;
            return this;
        }

        public Builder medManuf(String medManuf){
            this.medManuf = medManuf;
            return this;
        }

        public Builder medAmount(int medAmount){
            this.medAmount = medAmount;
            return this;
        }

        public Medication build(){
            return new Medication(this);
        }

        public Builder copy(Medication medication) {
            this.medId(medication.getMedId());
            return this;
        }
    }
//
//    public static void main(String[] args){
//        Medication medication = new Builder().medName("Allegex").medAmount(5).build();
//        System.out.print(medication.getMedName() +" "+ medication.getMedAmount());
//    }

}
