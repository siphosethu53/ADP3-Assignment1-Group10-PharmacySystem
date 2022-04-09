/* CustomerFactory.java
 Factory class for the Customer Entity
 Author: Zaeem Petersen (219010145)
 Date: 06 April 2022
*/
package Factory;

import Entity.Customer;
import Util.ZaeemHelper;

public class CustomerFactory {

    public static Customer createCustomer(int customerID, int prescID, String cusName, String cusGender, String contactNumber){

        if (ZaeemHelper.isNull(cusName) || ZaeemHelper.isNull(cusGender) || ZaeemHelper.isNull(contactNumber)){
            return null;
        }
        return new Customer.Builder().setCustomerID(customerID)
                .setPrescID(prescID)
                .setCusName(cusName)
                .setCusGender(cusGender)
                .setContactNumber(contactNumber)
                .build();
    }

}
