package Entity;

public class Supplier {
    private int suppId;
    private String suppName;
    private String suppAddress;
    private String suppContact;
    private String suppEmail;

    public int getSuppId() {
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

    public void setSuppId(int suppId) {
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
        private int suppId;
        private String suppName;
        private String suppAddress;
        private String suppContact;
        private String suppEmail;

        public Builder suppId(final int suppId){
            this.suppId = suppId;
            return this;
        }

        public Builder suppName(final String suppName){
            this.suppName = suppName;
            return this;
        }

        public Builder suppAddress(final String suppAddress){
            this.suppAddress = suppAddress;
            return this;
        }

        public Builder suppContact(final String suppContact){
            this.suppContact = suppContact;
            return this;
        }

        public Builder suppEmail(final String suppEmail){
            this.suppEmail = suppEmail;
            return this;
        }

        public Supplier build(){
            return new Supplier(this);
        }

    }

//    public static void main(String[] args){
//        Supplier supplier = new Builder().suppName("AlphaPharm").build();
//        System.out.print(supplier.getSuppName());
//    }

}
