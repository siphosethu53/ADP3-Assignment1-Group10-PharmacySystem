package Entity;

public class Medication {
    private String medId ;
    private String suppId ;
    private String medName;
    private String medManuf;

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


    @Override
    public String toString() {
        return "Medication{" +
                "medId='" + medId + '\'' +
                ", suppId='" + suppId + '\'' +
                ", medName='" + medName + '\'' +
                ", medManuf='" + medManuf + '\'' +
                '}';
    }

    private Medication(Builder builder){
        this.medId = builder.medId;
        this.suppId = builder.suppId;
        this.medName = builder.medName;
        this.medManuf = builder.medManuf;
    }


    public static class Builder{
        private String medId ;
        private String suppId ;
        private String medName;
        private String medManuf;

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
