

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
   int id;
   String name;
   public Employee(int id, String name) {
      super();
      this.id = id;
      this.name = name;
   }
}
public class Lambda {
   public static void main(String[] args) {
      List<Employee> list = new ArrayList<Employee>();

      // Adding employees
      list.add(new Employee(101, "Sneha"));
      list.add(new Employee(102, "Sree"));
      list.add(new Employee(103, "Swathi"));
      list.add(new Employee(104, "Rahul"));
      list.add(new Employee(105, "Vidul"));
      list.add(new Employee(106, "Mukund"));
      System.out.println("Sorting the employee list based on the name");

      // implementing lambda expression
      Collections.sort(list, (p1, p2) -> {
         return p1.name.compareTo(p2.name); 
      }); 
      for(Employee e : list) {
         System.out.println(e.id + " " + e.name);
      }
   }
}