package za.ac.cput.Create;

import za.ac.cput.Builder.Address;
import za.ac.cput.Builder.ContactType;

/**
 * @author Daniella Burgess 219446482
 * This is EmployeeContact.java
 * Date 05 April 2022
 */

public class EmployeeContact {

    public static void main(String[] args) {

        Address address = new Address.Builder().city("Cape Town")
                                                .houseNumber("23")
                                                .street("Fern Road")
                                                .zipCode("7941")
                                                .build();

        ContactType contactType = new ContactType.Builder().employeeId(1)
                                                           .email("daniellaburgessbqueen@gmail.com")
                                                           .address(address)
                                                           .cellphoneNumber(0672664466)
                                                           .build();


    }
}
