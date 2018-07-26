import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.function.*;

class Cleaner{
	public static void main (String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(null);
		list.add(2);
		list.add(null);
		list.add(3);
		System.out.println(list);
		removeNulls(list);
		System.out.println(list);
		remove(list, a -> (a > 2));
		System.out.println(list);
	}
	
	public static void removeNulls(Collection<?> collection) {
		Iterator itr = collection.iterator();
		while(itr.hasNext()){
			if(itr.next() == null){itr.remove();}
		}
	}
	
	public static <T> void remove(Collection<T> collection, Predicate<T> predicate) {
		Iterator<T> itr = collection.iterator();
		while(itr.hasNext()){
			if(predicate.test(itr.next())){itr.remove();}
		}		
	}	
}
