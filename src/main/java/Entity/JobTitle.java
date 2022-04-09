/*
 *  Name: Siphosethu Feni
 *  Student Number: 217237614
 *  Group: 10
 *
 */

package Entity;

public class JobTitle {

    private int employeeID, secretaryID, doctorID;

    private JobTitle(Builder builder) {
        this.employeeID=builder.employeeID;
        this.secretaryID =builder.secretaryID;
        this.doctorID = builder.doctorID;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public int getSecretaryID() {
        return secretaryID;
    }
    public int getDoctorID() {
        return doctorID;
    }

    public static class Builder {
        private int employeeID;
        private int secretaryID;
        private int doctorID;


        public Builder setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder setSecretaryID(int SecretaryID) {
            this.secretaryID = secretaryID;
            return this;
        }

        public Builder setDoctorID(int doctorID) {
            this.doctorID = doctorID;
            return this;
        }


        public JobTitle build() {
            return new JobTitle(this);
        }

        public Builder copy(JobTitle jobTitle) {
            this.employeeID = jobTitle.employeeID;
            this.secretaryID = jobTitle.secretaryID;
            this.doctorID = jobTitle.doctorID;
            return this;
        }
    }


    @Override
    public String toString() {
        return "JobTitleFactory{" +
                "employeeID='" + employeeID + '\'' +
                ", secretaryID='" + secretaryID + '\'' +
                ", doctorID='" + doctorID + '\'' +
                '}';
    }
}

