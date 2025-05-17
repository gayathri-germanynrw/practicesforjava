package com.cydeo.prc.javacoding;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        //Convert String to char arrays
        char[] arr1= str1.toCharArray();
        char[] arr2=str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("length of arr1 = " + arr1.length);
        for(int i=0;i<arr1.length;i++){
            System.out.println("arr1 = " + arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println("arr2 inside for = " + arr2[i]);
        }
        System.out.println("arr2 = " + arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println(str1 +"  and "+str2+" are Anagrams ." );
        }else{
            System.out.println(str1 +"  and "+str2+" are not Anagrams ." );
        }
    }

}
