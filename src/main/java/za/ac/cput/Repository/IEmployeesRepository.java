package za.ac.cput.Repository;

/* IEmployeesRepository.java
   Repository for the IEmployeesRepository
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Employees;

import java.util.Set;

public interface IEmployeesRepository extends IRepository<Employees, String> {

    public Set<Employees> getAll();
}
