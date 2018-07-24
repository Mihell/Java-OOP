import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {
    public static void main (String[] args){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));
        System.out.println(longestName(names));
    }

    public static String longestName(ArrayList<String> names){
        if(names.size() == 0){
            throw new IllegalArgumentException("EMPTY LIST");
        }
        String answer = "";
        for(String name : names){
            answer = (name.length() > answer.length()) ? name : answer;
        }
        return answer;
    }
}
