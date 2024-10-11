import java.util.*; 
import java.util.stream.Collectors; 

public class StreamSortingExample{
    public static void main(String[] args){
        List<String> strings=Arrays.asList("apple", "banana", "cherry", "kiwi"); 
        // Sort using streams and Comparator by length 
        List<String> sortedStrings = strings.stream()
                                            .sorted(Comparator.comparingInt(String::length))
                                            .collect(Collectors.toList()); 
        System.out.println(sortedStrings); // Kiwi, apple, banana, cherry 
        
    }
}