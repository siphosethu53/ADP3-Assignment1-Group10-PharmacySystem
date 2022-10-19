/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  * Project Group: 10
 * InventoryServiceImpl.java
 */

package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Inventory;
import za.ac.cput.repository.IInventoryRepository;

import java.util.List;

@Service
public class InventoryServiceImpl implements IInventoryService{
    private final IInventoryRepository repository;
    @Autowired
    public InventoryServiceImpl(IInventoryRepository repository){
        this.repository = repository;
    }

    @Override
    public Inventory save(Inventory inventory) {
        return this.repository.save(inventory);
    }

    @Override
    public Inventory read(Long aLong) {
        return this.repository.findById(aLong).orElse(null);
    }

    @Override
    public boolean delete(Long aLong) {
            this.repository.deleteById(aLong);
            return false;
    }

    @Override
    public List<Inventory> getAll() {
        return this.repository.findAll();
    }

}
