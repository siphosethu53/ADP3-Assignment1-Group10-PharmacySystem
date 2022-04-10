package za.ac.cput.Repository;
/*MedicationRepository.java
Repository Class for the Medication
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Medication;

import java.util.HashSet;
import java.util.Set;

public class MedicationRepository implements IMedicationRepository{

    private static MedicationRepository repository = null;
    private Set<Medication> MedicationDB = null;

    private MedicationRepository(){
        MedicationDB = new HashSet<Medication>();
    }

    public static MedicationRepository getRepository(){
        if (repository == null){
            repository = new MedicationRepository();
        }
        return repository;
    }


    @Override
    public Medication create(Medication medication) {
        boolean success = MedicationDB.add(medication);
        if(!success){
            return null;
        }
        return medication;
   }

    @Override
    public Medication read(String medId) {
        Medication medication = MedicationDB.stream()
                .filter(e -> e.getMedId().equals(medId))
                .findAny()
                .orElse(null);
            return medication;
    }

    @Override
    public Medication update(Medication medication) {
        Medication oldMedID = read(medication.getMedId());
        if (oldMedID != null) {
            MedicationDB.remove(oldMedID);
            MedicationDB.add(medication);
            return medication;
        }
        return null;
    }

    @Override
    public boolean delete(String medId) {
        Medication MedToDelete = read(medId);
        if(MedToDelete == null) {
            return false;
        }
        MedicationDB.remove(MedToDelete);
        return true;
    }

    @Override
    public Set<Medication> getAll() {
        return MedicationDB;
    }
}
