/*MedicationController.java
 * Controller class for Medication
 * Author: Ilyaas Davids (219466242)
 * Date: 11 Oct 2022
 */
package za.ac.cput.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Medication;
import za.ac.cput.service.MedicationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/medication")
public class MedicationController {

    private final MedicationServiceImpl medicationService;

    public MedicationController(MedicationServiceImpl medicationService) {
        this.medicationService = medicationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Medication>> getAllMedication(){
        List<Medication> medications = medicationService.getAll();
        return new ResponseEntity<>(medications, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Medication> readMedication(@PathVariable("id")String id){
        Medication medication = medicationService.read(id);
        return new ResponseEntity<>(medication, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Medication> saveMedication(@RequestBody Medication medication){
        Medication newMedication = medicationService.save(medication);
        return new ResponseEntity<>(newMedication,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Medication> updateMedication(@RequestBody Medication medication){
        Medication updateMedication = medicationService.save(medication);
        return new ResponseEntity<>(updateMedication,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMedication(@PathVariable("id")String id){
        medicationService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
