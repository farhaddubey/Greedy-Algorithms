// I can use comparators using thenComparing to sort by multiple fields, like sorting by name first 
// and then by age if the names are equal  
import java.util.*; 

class Person{
    String name; 
    int age; 
    Person(String name, int age){
        this.name=name; 
        this.age=age; 
    }
    @Override 
    public String toString(){
        return name+"("+age+")";
    }
}

public class MultiFieldSorting{
    public static void main(String[] args){
        List<Person> people=Arrays.asList(
            new Person("Alice", 30), 
            new Person("Bob", 25), 
            new Person("Charlie", 30), 
            new Person("Bob", 20)
        );
        // Sort by name first, then by age 
        people.sort(Comparator.comparing(Person::name).thenComparing(Person::age)); 
        System.out.println(people);
    }
}