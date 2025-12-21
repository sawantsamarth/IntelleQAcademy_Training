import java.util.*;

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "[ Id: "+ id + " Age: "+ age + " Name: " + name + " ] ";
    }

    @Override
    public int compareTo(Student other){
        // /sort student on the basis of there id.
        return this.id - other.id;
        // It will return -ve value if this.id < other.id. 
    }
}

class NameComparaotr implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class Compare {

    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(103, "Candice", 16));   
        stud.add(new Student(102, "Nina", 18));   
        stud.add(new Student(108, "Bonnie", 17)); 
        
        System.out.println("Original List:");
        for (Student s : stud) {
            System.out.println(s);
        }

        Collections.sort(stud);

        System.out.println("Sorted by Id (Comparable):");
        for (Student s : stud) {
            System.out.println(s);
        }

        Collections.sort(stud, new NameComparaotr());
        System.out.println("Sorted by Name (Comparator):");
        for (Student s : stud) {
            System.out.println(s);
        }

        Collections.sort(stud, (s1,s2) -> s1.getAge() - s2.getAge());
        System.out.println("Sorted by Lambda Expression::");
        for (Student s : stud) {
            System.out.println(s);
        }
    }
}