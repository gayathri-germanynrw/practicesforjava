package com.cydeo.prc.javacoding;

public class EmailValidator {

    public static void main(String[] args) {
        String emailStr="user@example.com";
        boolean val=isValidEmail(emailStr);
        if(val==true){
            System.out.println("Valid Email  -->"+emailStr);
        }
    }
    public static boolean  isValidEmail(String str){
        // Simple email regex pattern
        //String regx = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
     String regx="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
     String name="^[A-Za-z\\s]+$";
        System.out.println("strArr.toString() = " +str.matches(regx));
        if(str.matches(regx)){
            return true;
        }
        else{
            return false;
        }
    }
}
