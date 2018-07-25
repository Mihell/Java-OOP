package BinarySearch;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchRunner {
    public static void main(String[] args) {
        Integer[] array = {10, 20, 20, 30, 50};
        System.out.println("For arrays:");
        System.out.println(BinarySearch.binarySearch(array, 30)); // 3
        System.out.println(BinarySearch.binarySearch(array, 20)); // 2
        System.out.println(BinarySearch.binarySearch(array, 40)); // -5

        System.out.println();
        List list = Arrays.asList(array);

        System.out.println("Now for List:");
        System.out.println(BinarySearch.binarySearch(list, 30, (a, b) -> a - b));
        System.out.println(BinarySearch.binarySearch(list, 20, (a, b) -> a - b));
        System.out.println(BinarySearch.binarySearch(list, 40, (a, b) -> a - b));
    }
}
