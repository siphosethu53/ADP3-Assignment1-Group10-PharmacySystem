/* Customer.java
 Entity for the Customer
 Author: Zaeem Petersen (219010145)
 Date: 05 April 2022
*/
package Entity;

public class Customer {

    private int customerID;
    private int prescID;
    private String cusName;
    private String cusGender;
    private String contactNumber;

    //private builder constructor
    private Customer(Builder builder){
        this.customerID = builder.customerID;
        this.prescID = builder.prescID;
        this.cusName = builder.cusName;
        this.cusGender = builder.cusGender;
        this.contactNumber = builder.contactNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPrescID() {
        return prescID;
    }

    public void setPrescID(int prescID) {
        this.prescID = prescID;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "customer{" +
                "customerID=" + customerID +
                ", prescID=" + prescID +
                ", cusName='" + cusName + '\'' +
                ", cusGender='" + cusGender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public static class Builder{
        private int customerID;
        private int prescID;
        private String cusName;
        private String cusGender;
        private String contactNumber;

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setPrescID(int prescID) {
            this.prescID = prescID;
            return this;
        }

        public Builder setCusName(String cusName) {
            this.cusName = cusName;
            return this;
        }

        public Builder setCusGender(String cusGender) {
            this.cusGender = cusGender;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder copy(Customer customer){
            this.customerID = customer.customerID;
            this.prescID = customer.prescID;
            this.cusName = customer.cusName;
            this.cusGender = customer.cusGender;
            this.contactNumber = customer.contactNumber;

            return this;
        }
        public Customer build(){
            return new Customer(this);
        }

    }
}
