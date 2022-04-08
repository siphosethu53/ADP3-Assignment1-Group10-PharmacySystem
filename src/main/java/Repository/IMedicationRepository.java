package Repository;

import Entity.Medication;

import java.util.Set;

public interface IMedicationRepository extends IRepository<Medication,String>{
    public Set<Medication> getAll();
}
