package Entity;

/** EmployeeContact.java
 * Entity class for EmployeeContact
 * Author: Daniella Burgess (219446482)
 * Date: 05 April 2022
 */

public class EmployeeContact {

    private String employeeContactId;
    private String  typeId;
    private String empContact ;
    private String conDescription;

    private EmployeeContact(Builder builder){
        this.employeeContactId = builder.employeeContactId;
        this.typeId = builder.typeId;
        this.empContact  = builder.empContact ;
        this.conDescription = builder.conDescription;
    }


    public String getEmployeeContactId() {
        return employeeContactId;
    }

    public void setEmployeeContactId(String employeeContactId) {
        this.employeeContactId = employeeContactId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getEmpContact() {
        return empContact;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }

    public String getConDescription() {
        return conDescription;
    }

    public void setConDescription(String conDescription) {
        this.conDescription = conDescription;
    }

    @Override
    public String toString() {
        return "EmployeeContact{" +
                "employeeId=" + employeeContactId +
                ", typeId=" + typeId +
                ", empContact='" + empContact + '\'' +
                ", conDescription='" + conDescription + '\'' +
                '}';
    }

    public static class Builder {

        private String employeeContactId;
        private String typeId;
        private String empContact ;
        private String conDescription;


        public Builder employeeContactId(String employeeContactId) {
            this.employeeContactId = employeeContactId;
            return this;
        }

        public Builder typeId(String typeId){
            this.typeId = typeId;
            return this;
        }

        public Builder empContact(String empContact){
            this.empContact = empContact;
            return this;
        }

        public Builder conDescription(String conDescription){
            this.conDescription = conDescription;
            return this;
        }

        public Builder copy(EmployeeContact employeecontact) {
            this.employeeContactId = employeecontact.employeeContactId;
            this.typeId = employeecontact.typeId;
            this.empContact = employeecontact.empContact;
            this.conDescription = employeecontact.conDescription;
            return this;
        }

        public EmployeeContact build() {
            return new EmployeeContact(this);
        }
    }


}
