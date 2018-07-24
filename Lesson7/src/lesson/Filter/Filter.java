package lesson.Filter;

import java.util.*;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        if(list.size() == 0 || list == null){
            throw new IllegalArgumentException("Empty or null list");
        }

        List<T> result = new ArrayList<T>();

        for (T element : list
             ) {
            if(predicate.test(element)){
                result.add(element);
            }
        }
        return result;
    }
}
