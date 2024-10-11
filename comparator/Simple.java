import java.util.*; 
import java.io.*; 

class Simple{
    public static void main(String[] args){
        ArrayList<Student> list1=new ArrayList<>(); 
        list1.add(new Student(101, "Vijay", 23));
        list1.add(new Student(106, "Ajay", 27));
        list1.add(new Student(105, "Jai", 21)); 
        System.out.println("Sorting by Name: ");
        Collections.sort(list1, new NameComparator());
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Student st=(Student) itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("Sorting by age: ");
        Collections.sort(list, new AgeComparator());
        Iterator itr2=list.iterator();
        while(itr2.hasNext()){
            Student st=(Student) itr2.next();
            System.out.println(st.rollno+" "+st.name+" "st.age);
        }
    }
}