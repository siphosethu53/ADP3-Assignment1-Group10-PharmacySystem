package za.ac.cput.factory;

import za.ac.cput.domain.Prescription;
import za.ac.cput.util.StringHelper;

public class PrescriptionFactory {
    public static Prescription createPrescription(String prescID, String prescType, String prescDoses){

        //Checks if prescId, prescType or prescDoses is null or empty
        if(StringHelper.isNullorEmpty(prescID) || StringHelper.isNullorEmpty(prescType) || StringHelper.isNullorEmpty(prescDoses)){
            throw new IllegalArgumentException("PrescID or PrescType is null or empty");
        }

        return new Prescription.Builder().prescID(prescID)
                .prescType(prescType)
                .prescDoses(prescDoses)
                .build();
    }
}
