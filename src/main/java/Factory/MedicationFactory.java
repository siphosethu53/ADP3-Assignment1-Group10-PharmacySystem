package Factory;

import Entity.Medication;
import Util.IlyaasHelper;

public class MedicationFactory {

    public static Medication createMedication(String SuppID,String MedName,String MedManuf){
        String mID = IlyaasHelper.GenerateId();
        if (IlyaasHelper.isNullorEmpty(MedName)||IlyaasHelper.isNullorEmpty(MedManuf)){
            return null;
        }

        Medication medication = new Medication.Builder().medId(mID)
                .suppId(SuppID)
                .medName(MedName)
                .medManuf(MedManuf)
                .build();
        return medication;
    }

}
