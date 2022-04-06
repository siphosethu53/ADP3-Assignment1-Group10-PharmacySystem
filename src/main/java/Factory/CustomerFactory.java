package Factory;

import Entity.Customer;

public class CustomerFactory {

    public static Customer createCustomer(int customerID, int prescID, String cusName, String cusGender, String contactNumber){
        return new Customer.Builder().setCustomerID(customerID)
                .setPrescID(prescID)
                .setCusName(cusName)
                .setCusGender(cusGender)
                .setContactNumber(contactNumber)
                .build();
    }

}
