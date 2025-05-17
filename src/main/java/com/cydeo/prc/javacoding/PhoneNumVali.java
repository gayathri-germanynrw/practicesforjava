package com.cydeo.prc.javacoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumVali {
    public static void main(String[] args) {
        String input="+49 186 35551478";
        String resultStr="";
        Pattern pattern= Pattern.compile("^(\\+49)(d{3})(\\d+)$");
        Matcher matcher=pattern.matcher(input);
        if (matcher.matches()) {
            // Group 1: +49, Group 2: provider, Group 3: number
            resultStr=matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3);
            System.out.println(resultStr);
        }
        // If not matching, return as is or handle error

    }
}
