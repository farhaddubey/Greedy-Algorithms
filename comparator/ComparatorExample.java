import java.util.*; 

public class ComparatorExample{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(3, 9, 2, 7, 1, 8); 
        // Sort numbers in descending order using Comparator 
        Collections.sort(numbers, new Comparator<Integer>(){
            @Override 
            public int compare(Integer a, Integer b){
                return b-a; // Descending Order 
            }
        }); 
        System.out.println(numbers); 
    }
}