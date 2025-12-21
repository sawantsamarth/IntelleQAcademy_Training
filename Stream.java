import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    static class Employee{
        String name;
        int age;
        String department;
        double salary;

        Employee(String name, int age, String department, double salary){
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + " ( " +  department + ", $" + salary + " ) ";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Lucifer", 28, "It", 75000),
            new Employee("Chloe", 35, "Hr", 65000),
            new Employee("Amenadiel", 32, "It", 85000),
            new Employee("Maze", 29, "Finance", 90000),
            new Employee("Eve", 40, "It", 95000),
            new Employee("Lopez", 26, "hr",75000)
        );

        // filter those employees from the it department whose salaries are above 70000:

        List<Employee> filterEmpl = new ArrayList<>();
        for (Employee emp : employees) {
           if (emp.department.equals("It") && emp.salary > 70000) {
                filterEmpl.add(emp);            
           } 
        }

        for(Employee e : filterEmpl){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("THIS TIME WITH THE HELP OF STREAM API:");
        employees.stream()
        .filter(e -> e.department.equals("It"))
        .filter(e -> e.salary > 70000)
        .forEach(System.out::println);

        // sort the employees on the basis of their names alphabetically

        System.out.println();
        System.out.println("WITHOUT USING STREAM API:");
        List<String> name = new ArrayList<>();
        for (Employee emp : employees) {
            name.add(emp.name);
        }

        Collections.sort(name);
        System.out.println(name);

        System.out.println();
        System.out.println("WITH USING STREAM API:");

        List<String> sortedName = employees.stream().map(e -> e.name).sorted().collect(Collectors.toList());

        System.out.println(sortedName);


    }
}
