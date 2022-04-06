package za.ac.cput.domain;
import java.sql.Time;
import java.util.Date;
/*ConsultationRecord.java
 * Entity for the ConsultationRecord
 * Thabiso Matsaba 220296006
 * 05 April 2022
 */

public class ConsultationRecord {
    private int consultationRecordID;
    private int patientID;
    private Date consultationRecordDate;
    private Time consultationRecordTime;

    private ConsultationRecord(Builder builder) {
        this.consultationRecordID = builder.consultationRecordID;
        this.patientID = builder.patientID;
        this.consultationRecordDate = builder.consultationRecordDate;
        this.consultationRecordTime = builder.consultationRecordTime;
    }

    public int getConsultationRecordID() {
        return consultationRecordID;
    }

    public void setConsultationRecordID(int consultationRecordID) {
        this.consultationRecordID = consultationRecordID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Date getConsultationRecordDate() {
        return consultationRecordDate;
    }

    public void setConsultationRecordDate(Date consultationRecordDate) {
        this.consultationRecordDate = consultationRecordDate;
    }

    public Time getConsultationRecordTime() {
        return consultationRecordTime;
    }

    public void setConsultationRecordTime(Time consultationRecordTime) {
        this.consultationRecordTime = consultationRecordTime;
    }

    @Override
    public String toString() {
        return "ConsultationRecord{" +
                "consultationRecordID=" + consultationRecordID +
                ", patientID=" + patientID +
                ", consultationRecordDate=" + consultationRecordDate +
                ", consultationRecordTime=" + consultationRecordTime +
                '}';
    }

    public static class Builder {
        private int consultationRecordID;
        private int patientID;
        private Date consultationRecordDate;
        private Time consultationRecordTime;

        public Builder setConsultationRecordID(int consultationRecordID) {
            this.consultationRecordID = consultationRecordID;
            return this;
        }

        public Builder setPatientID(int patientID) {
            this.patientID = patientID;
            return this;
        }

        public Builder setConsultationRecordDate(Date consultationRecordDate) {
            this.consultationRecordDate = consultationRecordDate;
            return this;
        }

        public Builder setConsultationRecordTime(Time consultationRecordTime) {
            this.consultationRecordTime = consultationRecordTime;
            return this;
        }

    public Builder copy(ConsultationRecord consultationRecord) {
        this.consultationRecordID = consultationRecord.consultationRecordID;
        this.patientID = consultationRecord.patientID;
        this.consultationRecordDate = consultationRecord.consultationRecordDate;
        this.consultationRecordTime = consultationRecord.consultationRecordTime;
        return this;
    }
    
    private ConsultationRecord build(){
            return new ConsultationRecord(this);
        }
    }

}

