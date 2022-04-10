/* PrescriptionRepository.java
 Prescription Repository class
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Prescription;

import java.util.HashSet;
import java.util.Set;

public class PrescriptionRepository implements IPrescriptionRepository{

    private static  PrescriptionRepository repository = null;
    private Set<Prescription> prescriptionData = null;

    private PrescriptionRepository(){ prescriptionData= new HashSet<Prescription>();}

    //singleton
    public static PrescriptionRepository getRepository(){
        if(repository == null){
            repository = new PrescriptionRepository();
        }
        return repository;
    }

    @Override
    public Prescription create(Prescription prescription) {
        boolean success = prescriptionData.add(prescription);

        if(!success){
            return null;
        }
        else
            return prescription;
    }

    @Override
    public Prescription read(Integer prescID) {

        for(Prescription presc : prescriptionData){
            if (presc.getPrescID() == prescID)
                return presc;
        }
        return null;
    }

    @Override
    public Prescription update(Prescription prescription) {
        Prescription oldPresciption = read(prescription.getPrescID());
        if(oldPresciption != null){
            prescriptionData.remove(oldPresciption);
            prescriptionData.add(prescription);
            return prescription;
        }
        else
        return null;
    }

    @Override
    public boolean delete(Integer prescID) {
        Prescription prescriptionDelete = read(prescID);
        if (prescriptionDelete == null){
            return false;
        }
        else
            prescriptionData.remove(prescriptionDelete);
            return true;
    }

    @Override
    public Set<Prescription> getAll() {
        return prescriptionData;
    }
}
