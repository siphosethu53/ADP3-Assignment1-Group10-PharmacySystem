package Factory;

import Entity.Prescription;

public class PrescriptionFactory {

    public static Prescription createPrescription(int prescID, int customerID, String prescType, int prescDoses){
        return new Prescription.Builder().setPrescID(prescID)
                .setCustomerID(customerID)
                .setPrescType(prescType)
                .setPrescDoses(prescDoses)
                .build();
    }
}
