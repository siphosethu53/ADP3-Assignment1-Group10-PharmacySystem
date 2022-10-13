package za.ac.cput.service;

import za.ac.cput.domain.Medication;

import java.util.List;

public interface MedicationService extends IService<Medication,String>{

    List<Medication> getAll();

}
