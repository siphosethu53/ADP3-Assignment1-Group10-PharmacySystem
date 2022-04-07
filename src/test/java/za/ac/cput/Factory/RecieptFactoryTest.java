package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Reciept;
import java.time.LocalDateTime;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

/* RecieptFactoryTest.java
 * FactoryTest for the Reciept
 * Thabiso Matsaba 220296006
 * 07 April 2022
 */


class RecieptFactoryTest {

    @Test
    public void test() {

        Reciept reciept = RecieptFactory.createReciept(1234, 1235, new Date() );
        System.out.println(reciept);
    }
}