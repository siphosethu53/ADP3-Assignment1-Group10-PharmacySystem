/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  * Project Group: 10
 * IInventoryService.java
 */

package za.ac.cput.service;


import za.ac.cput.domain.Inventory;

import java.util.List;

public interface IInventoryService extends IService<Inventory, Long> {
    List<Inventory> getAll();
}
