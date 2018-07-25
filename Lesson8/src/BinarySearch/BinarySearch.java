package BinarySearch;

import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    static int binarySearch(Integer[] array, int elem){
        int i = array.length / 2;
        int begin = 0;
        int end = array.length - 1;
        while(begin < end) {
            if (array[i] == elem) {
                return i;
            }
            if (elem < array[i]) {
                end = i - 1;
                i = (end - begin) / 2;
            } else {
                begin = i + 1;
                i = begin + (end - begin) / 2;
            }
        }
        return -(begin + 1);
    }

    static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator){
        int i = list.size() / 2;
        int begin = 0;
        int end = list.size() - 1;
        while(begin < end) {
            if (comparator.compare(list.get(i), elem) == 0) {
                return i;
            }
            if (comparator.compare(elem, list.get(i)) < 0) {
                end = i - 1;
                i = (end - begin) / 2;
            } else {
                begin = i + 1;
                i = begin + (end - begin) / 2;
            }
        }
        return -(begin + 1);
    }
}
