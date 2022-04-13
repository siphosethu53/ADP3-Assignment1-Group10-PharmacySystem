package za.ac.cput.Repository;

import za.ac.cput.Entity.Inventory;

import java.util.Set;

public interface IInventoryRepository extends IRepository<Inventory,Integer>{
      Set<Inventory> getAlll();
}
