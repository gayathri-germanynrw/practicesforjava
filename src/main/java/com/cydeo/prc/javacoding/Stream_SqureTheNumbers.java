package com.cydeo.prc.javacoding;

import java.util.*;

public class Stream_SqureTheNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(5,1,4,6,8,9));

        List<Integer> squred_Numbers=numbers.stream().map(p->p*p).toList();
        System.out.println(squred_Numbers);
    }
}
