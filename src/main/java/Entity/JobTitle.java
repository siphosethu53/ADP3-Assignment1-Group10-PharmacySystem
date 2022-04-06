/*
 *  Name: Abongile Tshopi
 *  Student Number: 214254151
 *  Group: 23
 *
 */

package Entity;

public class JobTitle {

    private String employeeID, secretaryID, doctorID;

    private JobTitle(Builder builder) {
        this.employeeID=builder.employeeID;
        this.secretaryID =builder.secretaryID;
        this.doctorID = builder.doctorID;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public String getSecretaryID() {
        return secretaryID;
    }
    public String getDoctorID() {
        return doctorID;
    }

    public static class Builder {
        private String employeeID;
        private String secretaryID;
        private String doctorID;


        public Builder setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder setSecretaryID(String SecretaryID) {
            this.secretaryID = secretaryID;
            return this;
        }

        public Builder setDoctorID(String doctorID) {
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
        return "JobTitle{" +
                "employeeID='" + employeeID + '\'' +
                ", secretaryID='" + secretaryID + '\'' +
                ", doctorID='" + doctorID + '\'' +
                '}';
    }
}

