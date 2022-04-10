package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.ConsultationRecord;
import za.ac.cput.Factory.ConsultationRecordFactory;
import java.util.Date;
/* ConsultationRecordRepositoryTest.java
 * Repository Test for the ConsultationRecord
 * Thabiso Matsaba 220296006
 * 08 April 2022
 */

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ConsultationRecordRepositoryTest {
    private static ConsultationRecordRepository repository = ConsultationRecordRepository.getRepository();
    private static ConsultationRecord consultationRecord = ConsultationRecordFactory.createConsultationRecord(233, 1234, new Date(), null);
    @Test
    void a_create() {
        ConsultationRecord created = repository.create(consultationRecord);
        assertEquals(consultationRecord.getConsultationRecordID(), created.getConsultationRecordID());
        System.out.println("ConsultationRecord: " + consultationRecord);
    }

    @Test
    void b_read() {
        ConsultationRecord scan = repository.read(consultationRecord.getConsultationRecordID());
        assertNotNull(scan);
        System.out.println("Read: " + scan);
    }

    @Test
    void c_update() {
        ConsultationRecord updated = new ConsultationRecord.Builder().copy(consultationRecord)
                .setConsultationRecordID(244)
                .setPatientID(554)
                .setConsultationRecordDate(new Date())
                .setConsultationRecordTime(null)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(consultationRecord.getConsultationRecordID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("ConsultationRecords: ");
        System.out.println(repository.getAll());

    }
}