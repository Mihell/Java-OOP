package lesson.Max;

import java.util.Comparator;
import java.util.List;

public class Max {
    public static <T> T max(List<T> list, Comparator<T> comparator) {
        if(list.size() == 0 || list == null){
            throw new IllegalArgumentException("List has no elements");
        }
        T maxElement = list.get(0);
        for (T element : list
             ) {
            if(comparator.compare(element, maxElement) > 0){
                maxElement = element;
            }
        }
        return maxElement;
    }
}
