package za.ac.cput.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    private String staffId;
    private String email;
    @Embedded
    private Name name;

    protected Employee(){}

    //builder constructor
    private  Employee (Builder builder){
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    //getters
    public String getStaffId(){
        return staffId;
    }
    public String getEmail(){
        return email;
    }
    public Name getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' + '}';
    }

    //builder class
    public static class Builder {
        private String staffId;
        private String email;
        private Name name;

        public Builder staffId(String staffId) {
            this.staffId=staffId;
            return this;
        }

        public Builder email(String email) {
            this.email=email;
            return this;
        }

        public Builder name(Name name){
            this.name = name;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;
            return this;
        }
        public Employee build(){ return new Employee(this);}
    }


}
