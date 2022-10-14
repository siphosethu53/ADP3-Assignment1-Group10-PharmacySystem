/*SupplierController.java
 * Controller class for Supplier
 * Author: Ilyaas Davids (219466242)
 * Date: 11 Oct 2022
 */
package za.ac.cput.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Supplier;
import za.ac.cput.service.SupplierServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierContoller {

    private final SupplierServiceImpl supplierService;

    public SupplierContoller(SupplierServiceImpl supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Supplier>> getAllSupplier(){
        List<Supplier> suppliers  = supplierService.getAll();
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Supplier> readSupplier(@PathVariable("id")String id){
        Supplier supplier = supplierService.read(id);
        return new ResponseEntity<>(supplier, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier supplier){
        Supplier newSupplier = supplierService.save(supplier);
        return new ResponseEntity<>(newSupplier,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Supplier> updateSupplier(@RequestBody Supplier supplier){
        Supplier updateSupplier = supplierService.save(supplier);
        return new ResponseEntity<>(updateSupplier,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSupplier(@PathVariable("id")String id){
        supplierService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
