package com.codecool.dynamicarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Execute all tests to check your work.");
        int[] testArray = {1, 2, 3, 4, 5};
        DynamicArray array = new DynamicArray(testArray);
        System.out.println("size " + array.size());
        System.out.println("capcity " + array.getCapacity());
        array.insert(2, 10);
        Arrays.stream(array.getArray()).forEach(i -> System.out.println(i +" "));
        System.out.println("size " + array.size());
        System.out.println("capcity " + array.getCapacity());


    }

}
