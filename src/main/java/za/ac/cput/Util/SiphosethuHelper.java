//*  Name: Siphosethu
 //       *  Student Number: 217237614
 //       *  Group: 10
//        *
//        */

package za.ac.cput.Util;

import java.util.UUID;

public class SiphosethuHelper {
    public static int generateID()
    {
        return UUID.randomUUID().hashCode();
    }

    public static boolean validEmail(String email) {
        String regex = "^\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
        return email.matches(regex);
    }
}
