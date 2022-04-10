/* PrescriptionFactory.java
 Factory class for the Prescription Entity
 Author: Zaeem Petersen (219010145)
 Date: 06 April 2022
*/
package za.ac.cput.Factory;

import za.ac.cput.Entity.Prescription;
import za.ac.cput.Util.ZaeemHelper;

public class PrescriptionFactory {

    public static Prescription createPrescription(int prescID, int customerID, String prescType, int prescDoses){

        if (ZaeemHelper.isNull(prescType)){
           return null;
        }
        return new Prescription.Builder().setPrescID(prescID)
                .setCustomerID(customerID)
                .setPrescType(prescType)
                .setPrescDoses(prescDoses)
                .build();
    }
}
