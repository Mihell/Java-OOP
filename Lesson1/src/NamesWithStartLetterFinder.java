import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {
    public static void main (String[] args){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println(namesWithStartLetter(names, 'A'));
    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> result = new ArrayList<>();
        for(String name : names){
            if(name.charAt(0) == startLetter){
                result.add(name);
            }
        }
        return result;
    }
}
