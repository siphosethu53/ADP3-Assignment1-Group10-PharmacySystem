package za.ac.cput.Util;


import org.apache.commons.validator.EmailValidator;

import java.util.UUID;

public class IlyaasHelper {
    public static boolean isNullorEmpty(String s) {
        return (s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }

    public static String GenerateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

}
