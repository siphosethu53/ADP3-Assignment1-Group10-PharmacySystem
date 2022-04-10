package Repository;
/*IMedicationRepository.java
Interface Repository for the Medication
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import Entity.Medication;

import java.util.Set;

public interface IMedicationRepository extends IRepository<Medication,String>{
    public Set<Medication> getAll();
}
