package za.ac.cput.Repository;
import za.ac.cput.Entity.ConsultationRecord;
import java.util.HashSet;
import java.util.Set;
/* ConsultationRecordRepository.java
 * Repository for the ConsultationRecord
 * Thabiso Matsaba 220296006
 * 08 April 2022
 */

public class ConsultationRecordRepository implements IConsultationRecordRepository {
    private static ConsultationRecordRepository repository = null;
    private Set<ConsultationRecord> consultationRecordObjects = null;

    private ConsultationRecordRepository(){

        consultationRecordObjects  = new HashSet<ConsultationRecord>();
    }

    public static ConsultationRecordRepository getRepository() {
        if (repository == null) {
            repository = new ConsultationRecordRepository();
        }
        return repository;
    }

    @Override
    public ConsultationRecord create(ConsultationRecord consultationRecord) {
        boolean success = consultationRecordObjects .add(consultationRecord);
        if(!success)
            return null;
        return consultationRecord;
    }

    @Override
    public ConsultationRecord read(Integer consultationRecordID) {
        for (ConsultationRecord e : consultationRecordObjects) {
            if (e.getConsultationRecordID() == consultationRecordID);
            return e;
        }
        return null;
    }



    @Override
    public ConsultationRecord update(ConsultationRecord consultationRecord) {
        ConsultationRecord oldConsultationRecord = read(consultationRecord.getConsultationRecordID());
        if (oldConsultationRecord != null){
            consultationRecordObjects.remove(oldConsultationRecord);
            consultationRecordObjects.add(consultationRecord);
            return consultationRecord;
        }
        return null;
    }

    @Override
    public boolean delete(Integer consultationRecordID) {
        ConsultationRecord consultationRecordToDelete = read(consultationRecordID);
        if(consultationRecordToDelete == null)
            return false;
        consultationRecordObjects.remove(consultationRecordToDelete);
        return true;
    }

    @Override
    public Set<ConsultationRecord> getAll() {

        return consultationRecordObjects;
    }
}
