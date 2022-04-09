package Test;

/** ContactTypeFactoryTest.java
 * Test for the ContactTypeFactory
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import Entity.ContactType;
import Factory.ContactTypeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTypeFactoryTest {

    @Test
    public void test(){
        ContactType contactType = ContactTypeFactory.createContactType("Phone Number", "Primary contact");
        System.out.println(contactType);
        assertNotNull(contactType);
    }

}