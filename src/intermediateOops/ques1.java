import java.util.HashSet;

class Employee {
    int id;
    String name, department;
    double salary;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }
}

public class ques1 {
    public static void main(String[] args) {

        // We cannot add Object of any other type except Employee
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(1, "aa", 10000, "Finance"));
        employees.add(new Employee(2, "bb", 200000, "Human Resource"));
        employees.add(new Employee(3, "cc", 300000, "Engineering"));
        employees.add(new Employee(4, "dd", 450000, "Engineering"));
        employees.add(new Employee(5, "ee", 50000, "research"));

        for (Employee e : employees) {
            e.displayDetails();
        }

    }
}