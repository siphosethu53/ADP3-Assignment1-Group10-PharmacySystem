package Util;

import java.util.UUID;

public class DaniellaHelper {

    public static int EmployeeContactId(){
        return UUID.randomUUID().variant();}



    public static int ContactTypeId(){
        return UUID.randomUUID().variant();}
}
