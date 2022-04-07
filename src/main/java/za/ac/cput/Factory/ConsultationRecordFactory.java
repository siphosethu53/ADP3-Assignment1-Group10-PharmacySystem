package za.ac.cput.Factory;
import za.ac.cput.Entity.ConsultationRecord;
import java.sql.Time;
import java.util.Date;

/*ConsultationRecordFactory.java
 * Factory for the ConsultationRecord
 * Thabiso Matsaba 220296006
 * 06 April 2022
 */

public class ConsultationRecordFactory {
    
    public static ConsultationRecord createConsultationRecord(int consultationRecordID, int patientID, Date consultationRecordDate, Time consultationRecordTime){
        
        return new ConsultationRecord.Builder().setConsultationRecordID(consultationRecordID)
                                               .setPatientID(patientID)
                                               .setConsultationRecordDate(consultationRecordDate)
                                               .setConsultationRecordTime(consultationRecordTime)
                                               .build();
    }
}
