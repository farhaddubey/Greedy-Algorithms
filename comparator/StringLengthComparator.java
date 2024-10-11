// Example 2: Sorting Strings By Length  
import java.util.*; 

public class StringLengthComparator{
    public static void main(String[] args){
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "kiwi");
        // Sorting strings by length using Comparator 
        Collections.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.length() - s2.length(); // Ascending Order of length 
            }
        }); 
        System.out.println(strings);
    }
}