package za.ac.cput.Repository;

import za.ac.cput.Entity.ConsultationRecord;

import java.util.Set;
/* IConsultationRecordRepository.java
 * Repository for the ConsultationRecord
 * Thabiso Matsaba 220296006
 * 08 April 2022
 */

public interface IConsultationRecordRepository extends IRepository<ConsultationRecord, String> {

    public Set<ConsultationRecord> getAll();
}
