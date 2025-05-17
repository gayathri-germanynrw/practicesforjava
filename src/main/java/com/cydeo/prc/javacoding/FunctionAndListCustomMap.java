package com.cydeo.prc.javacoding;
import java.util.*;
import java.util.function.Function;

public class FunctionAndListCustomMap {
    /*
    Map Implementation
Write your own version of the map function that applies a function to each element of an array.
Java# Example: customMap([1, 2, 3], lambda x: x*2) should return [2, 4, 6]
     */

    public static <T, R> List<R> customMap(List<T> input, Function<T, R> func) {
        List<R> result = new ArrayList<>();
        for (T item : input) {
            result.add(func.apply(item));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> doubled = customMap(numbers, x -> x * 2);
        System.out.println(doubled); // Output: [2, 4, 6]
    }
}



