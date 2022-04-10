package Entity;
/*Supplier.java
Entity for the Supplier
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
public class Supplier {
    private String suppId;
    private String suppName;
    private String suppAddress;
    private String suppContact;
    private String suppEmail;

    public String getSuppId() {
        return suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public String getSuppContact() {
        return suppContact;
    }

    public String getSuppEmail() {
        return suppEmail;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress;
    }

    public void setSuppContact(String suppContact) {
        this.suppContact = suppContact;
    }

    public void setSuppEmail(String suppEmail) {
        this.suppEmail = suppEmail;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "suppId=" + suppId +
                ", suppName='" + suppName + '\'' +
                ", suppAddress='" + suppAddress + '\'' +
                ", suppContact='" + suppContact + '\'' +
                ", suppEmail='" + suppEmail + '\'' +
                '}';
    }

    private Supplier(Builder builder){
        this.suppId = builder.suppId;
        this.suppName = builder.suppName;
        this.suppAddress = builder.suppAddress;
        this.suppContact = builder.suppContact;
        this.suppEmail = builder.suppEmail;
    }

    public static class Builder{
        private String suppId;
        private String suppName;
        private String suppAddress;
        private String suppContact;
        private String suppEmail;


        public Builder suppId(String suppId){
            this.suppId = suppId;
            return this;
        }

        public Builder suppName(String suppName){
            this.suppName = suppName;
            return this;
        }

        public Builder suppAddress(String suppAddress){
            this.suppAddress = suppAddress;
            return this;
        }

        public Builder suppContact(String suppContact){
            this.suppContact = suppContact;
            return this;
        }

        public Builder suppEmail(String suppEmail){
            this.suppEmail = suppEmail;
            return this;
        }

        public Supplier build(){
            return new Supplier(this);
        }

        public Builder copy(Supplier supplier) {
            this.suppId(supplier.getSuppId());
            return this;
        }
    }


//    public static void main(String[] args){
//        Supplier supplier = new Builder().suppName("AlphaPharm").build();
//        System.out.print(supplier.getSuppName());
//    }

}
