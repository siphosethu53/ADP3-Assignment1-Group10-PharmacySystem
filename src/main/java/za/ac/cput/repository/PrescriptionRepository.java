package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription,String> {


}
