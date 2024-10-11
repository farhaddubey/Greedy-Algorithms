import java.util.*;

public class LambdaComparatorExample{
    public static void main(String[] args){
        List<String> strings=Arrays.asList("banana", "apple", "kiwi", "cherry");
        // Sorting strings by length using Lambda expressions 
        Collections.sort(strings, (s1, s2)->s1.length() - s2.length()); 
        System.out.println(strings);
    }
}