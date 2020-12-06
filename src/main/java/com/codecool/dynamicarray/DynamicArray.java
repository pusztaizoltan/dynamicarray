package com.codecool.dynamicarray;

import java.util.Arrays;

public class DynamicArray {
    private int capacity;
    public int[] array;
//    private int[] array;
    private int size = 0;

    // to test in preset array use array with length mor then 4
    public DynamicArray(int[] testArray) {
        this.array = testArray;
        this.capacity = testArray.length;
        this.size = testArray.length;
    }

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
    }

    public DynamicArray() {
        this.array = new int[4];
        this.capacity = 4;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        if(size == capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);

        }
        array[size] = value;
        size++;
    }

    public int get(int index){
        return array[index];
    }

//    public int get(int index) throws ArrayIndexOutOfBoundEception {
//        if (size <= index){ throw new ArrayIndexOutOfBoundEception();}
//        return array[index];
//
//    }


    public void remove(int indexToBeRemoved) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == indexToBeRemoved) continue;
            newArray[j] = array[i];
            j +=1;
        }
        array = newArray;
        size--;
    }


    public void insert(int index, int newValue) {
        if(size == capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
//            System.out.println("double capaciti");
        }
        if(index >=size) {
            add(newValue);
//            System.out.println("add to the end");
        } else {
            int[] newArray = new int[capacity];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = newValue;
            for (int i = index; i < size; i++) {
                newArray[i+1] = array[i];
            }
            array = newArray;
            size++;
        }
    }
    public String toString() {
        String stingReprezentation = "[";
        if (0 == size) return stingReprezentation + "]";
        for(int i = 0; i<size; i++) {
            stingReprezentation += array[i];
            if (i < size - 1) {
                stingReprezentation += ", ";
            } else {
                stingReprezentation += "]";}
        }
        return stingReprezentation;
    }

//    private class ArrayIndexOutOfBoundEception extends Exception {
//    }


}
