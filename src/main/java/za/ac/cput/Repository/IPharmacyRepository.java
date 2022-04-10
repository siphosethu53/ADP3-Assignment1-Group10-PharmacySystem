package za.ac.cput.Repository;

/* IPharmacyRepository.java
   Repository for the IPharmacyRepository
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Pharmacy;

import java.util.Set;

public interface IPharmacyRepository extends IRepository<Pharmacy, String> {

    public Set<Pharmacy> getAll();
}
