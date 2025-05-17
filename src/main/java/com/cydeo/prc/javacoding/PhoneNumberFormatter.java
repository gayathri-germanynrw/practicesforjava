package com.cydeo.prc.javacoding;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFormatter {
        public static String formatPhoneNumber(String input) {
            // Regex: +49, then 3 digits (provider), then the rest (number)
            Pattern pattern = Pattern.compile("^(\\+49)(\\d{3})(\\d+)$");
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                // Group 1: +49, Group 2: provider, Group 3: number
                return matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3);
            }
            // If not matching, return as is or handle error
            return input;
        }

        public static void main(String[] args) {
            String formatted = formatPhoneNumber("+4915112345678");
            System.out.println(formatted); // Output: +49 151 12345678
        }
    }


