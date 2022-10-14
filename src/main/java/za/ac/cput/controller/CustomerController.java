//package za.ac.cput.controller;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.domain.Customer;
//import za.ac.cput.service.CustomerService;
//
//import java.util.List;
//import java.util.Optional;
//
///* CustomerController.java
// * Controller class for the Customer Entity
// * @Author: Thabiso Matsaba (220296006)
// * Date:  22 September 2022
// */
//@RestController
//@RequestMapping("/customer")
//@Slf4j
//public class CustomerController {
//
//    private final CustomerService customerService;
//
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//
//        this.customerService = customerService;
//    }
//
//    private Optional<Customer> getById(String id) {
//
//        return this.customerService.read(id);
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<Customer> create(@Validated @RequestBody Customer customer) {
//        log.info("Save request: {}", customer);
//        Customer save = customerService.create(customer);
//        return ResponseEntity.ok(save);
//    }
//
//    @GetMapping("/read/{id}")
//    public ResponseEntity<Customer> read(@PathVariable("id") String id) {
//        log.info("Read request:{}", id);
//        Customer customer = getById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        return ResponseEntity.ok(customer);
//
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Customer> update(@Validated @RequestBody Customer customer) {
//        log.info("Update request: {}", customer);
//        Customer update = customerService.update(customer);
//        return ResponseEntity.ok(update);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        log.info("Delete request{}", id);
//        this.customerService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/findAll")
//    public ResponseEntity<List<Customer>> findAll() {
//        List<Customer> customerList = this.customerService.findAll();
//        return ResponseEntity.ok(customerList);
//    }
//}
