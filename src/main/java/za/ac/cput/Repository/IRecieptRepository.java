package za.ac.cput.Repository;

import za.ac.cput.Entity.Reciept;

import java.util.Set;
/* IRecieptRepository.java
 * Repository for the Reciept
 * Thabiso Matsaba 220296006
 * 08 April 2022
 */

public interface IRecieptRepository extends IRepository<Reciept, Integer>{

    public Set<Reciept> getAll();
}
