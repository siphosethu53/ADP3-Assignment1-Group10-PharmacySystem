package za.ac.cput.Factory;
import za.ac.cput.Entity.Reciept;
import java.time.LocalDateTime;
import java.util.Date;
/* RecieptFactory.java
 * Factory for the Reciept
 * Thabiso Matsaba 220296006
 * 06 April 2022
 */

public class RecieptFactory {
    
    public static Reciept createReciept(int recieptID, int prescriptionID, Date recieptDate){

        return new Reciept.Builder().setRecieptID(recieptID)
                                    .setPrescriptionID(prescriptionID)
                                    .setRecieptDate(recieptDate)
                                    .build();
    }
    
}
