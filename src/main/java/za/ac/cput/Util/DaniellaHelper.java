package za.ac.cput.Util;

/**DaniellaHelper.java
 * Helper class
 * Author: Daniella Burgess (219446482)
 * Date: 07 April 2022
 */

import java.util.UUID;

public class DaniellaHelper {

    public static String EmployeeContactId(){
        return UUID.randomUUID().toString();}

    public static String ContactTypeId(){
        return UUID.randomUUID().toString();}
}
