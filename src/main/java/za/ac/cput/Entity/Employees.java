package za.ac.cput.Entity;

/* Employees.java
   Entity for the Employees
   Author: Waseem Dollie (216040566)
   Date: 5 April 2022
*/

public class Employees {
    private String employeeNumber;
    private int doctorID;
    private int secretaryID;
    private int cashierID;
    private String employeeName;
    private String employeeContactNumber;

    private Employees (){}
    //Insert private constructor
    private Employees (Employees.Builder builder){
        this.employeeNumber=builder.employeeNumber;
        this.doctorID=builder.doctorID;
        this.secretaryID=builder.secretaryID;
        this.cashierID=builder.cashierID;
        this.employeeName=builder.employeeName;
        this.employeeContactNumber=builder.employeeContactNumber;
    }


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public int getDoctorId() {
        return doctorID;
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
                ", doctorId=" + doctorID +
                ", secretaryID=" + secretaryID +
                ", cashierID=" + cashierID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeContactNumber='" + employeeContactNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber;
        private int doctorID;
        private int secretaryID;
        private int cashierID;
        private String employeeName;
        private String employeeContactNumber;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setDoctorId(int doctorID) {
            this.doctorID = doctorID;
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
            this.doctorID=employees.doctorID;
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
