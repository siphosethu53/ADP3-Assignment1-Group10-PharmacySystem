package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.ConsultationRecord;
import java.util.Date;

/*ConsultationRecordFactoryTest.java
 * FactoryTest for the ConsultationRecord
 * Thabiso Matsaba 220296006
 * 07 April 2022
 */

class ConsultationRecordFactoryTest {

    @Test
    public void test() {

        ConsultationRecord consultationRecord = ConsultationRecordFactory.createConsultationRecord(1234, 2344, new Date(), null);
        System.out.println(consultationRecord);
    }

}