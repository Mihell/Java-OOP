package lesson.ComparablePair;

public class ComparablePair<T extends Comparable> {
    private T first;
    private T second;

    public ComparablePair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T bigger(){
        if(first.compareTo(second) < 0){
            return second;
        } else{
            return first;
        }
    }

    public T smaller(){
        if(first.compareTo(second) > 0){
            return second;
        } else{
            return first;
        }
    }
}
