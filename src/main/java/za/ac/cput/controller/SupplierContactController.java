/*SupplierContactController.java
 * Controller class for SupplierContact
 * Author: Ilyaas Davids (219466242)
 * Date: 11 Oct 2022
 */
package za.ac.cput.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Supplier;
import za.ac.cput.domain.SupplierContact;
import za.ac.cput.service.SupplierContactServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/supplierContact")
public class SupplierContactController {

    private final SupplierContactServiceImpl supplierContactService;

    public SupplierContactController(SupplierContactServiceImpl supplierContactService) {
        this.supplierContactService = supplierContactService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SupplierContact>> getAllSupplierContact(){
        List<SupplierContact> supplierContacts  = supplierContactService.getAll();
        return new ResponseEntity<>(supplierContacts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<SupplierContact> readSupplierContact(@PathVariable("id")String id){
        SupplierContact supplierContact = supplierContactService.read(id);
        return new ResponseEntity<>(supplierContact, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SupplierContact> saveSupplierContact(@RequestBody SupplierContact supplierContact){
        SupplierContact newSupplierContact = supplierContactService.save(supplierContact);
        return new ResponseEntity<>(newSupplierContact,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<SupplierContact> updateSupplierContact(@RequestBody SupplierContact supplierContact){
        SupplierContact updateSupplierContact = supplierContactService.save(supplierContact);
        return new ResponseEntity<>(updateSupplierContact,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSupplierContact(@PathVariable("id")String id){
        supplierContactService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
