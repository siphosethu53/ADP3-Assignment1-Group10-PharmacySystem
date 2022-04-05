package za.ac.cput.Entity;

import za.ac.cput.Builder.Address;

/**
 * @author Daniella Burgess 219446482
 * This is ContactType.java
 * Date 05 April 2022
 */

public class ContactType {

    private int employeeId;
    private String email;
    private Address address;
    private int cellphoneNumber;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(int cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "employeeId=" + employeeId +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", cellphoneNumber=" + cellphoneNumber +
                '}';
    }
}
