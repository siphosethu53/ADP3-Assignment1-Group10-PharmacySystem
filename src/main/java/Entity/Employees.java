package Entity;

public class Employees {
    private String employeeNumber;
    private int doctorId;
    private int secretaryID;
    private int cashierID;
    private String employeeName;
    private String employeeContactNumber;

    private Employees (){}
    //Insert private constructor
    private Employees (Employees.Builder builder){
        this.employeeNumber=builder.employeeNumber;
        this.doctorId=builder.doctorId;
        this.secretaryID=builder.secretaryID;
        this.cashierID=builder.cashierID;
        this.employeeName=builder.employeeName;
        this.employeeContactNumber=builder.employeeContactNumber;
    }


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getSecretaryID() {
        return secretaryID;
    }

    public int getCashierID() {
        return cashierID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeNumber=" + employeeNumber +
                ", doctorId=" + doctorId +
                ", secretaryID=" + secretaryID +
                ", cashierID=" + cashierID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeContactNumber='" + employeeContactNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber;
        private int doctorId;
        private int secretaryID;
        private int cashierID;
        private String employeeName;
        private String employeeContactNumber;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setDoctorId(int doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setSecretaryID(int secretaryID) {
            this.secretaryID = secretaryID;
            return this;
        }

        public Builder setCashierID(int cashierID) {
            this.cashierID = cashierID;
            return this;
        }

        public Builder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public Builder setEmployeeContactNumber(String employeeContactNumber) {
            this.employeeContactNumber = employeeContactNumber;
            return this;
        }

        public Employees.Builder copy (Employees employees){
            this.employeeNumber=employees.employeeNumber;
            this.doctorId=employees.doctorId;
            this.secretaryID=employees.secretaryID;
            this.cashierID=employees.cashierID;
            this.employeeName=employees.employeeName;
            this.employeeContactNumber=employees.employeeContactNumber;

            return this;
        }
        public Employees build (){
            return new Employees(this);
        }

    }

}
