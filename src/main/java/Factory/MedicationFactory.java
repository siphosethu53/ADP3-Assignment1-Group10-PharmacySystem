package Factory;

import Entity.Medication;
import Util.IlyaasHelper;

public class MedicationFactory {

    public static Medication createMedication(int suppID,String MedName,String MedManuf,int MedAmount){
        int medID = IlyaasHelper.MedId();
        Medication medication = new Medication.Builder().medId(medID)
                .suppId(suppID)
                .medName(MedName)
                .medManuf(MedName)
                .medAmount(MedAmount)
                .build();
        return medication;
    }

}
