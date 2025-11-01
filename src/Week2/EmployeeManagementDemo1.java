package Week2;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void calculateBonus() {
        System.out.println(name + " received 10% bonus = " +(salary * 0.10));
    }
}
class Manager extends Employee{
    Manager(String name, double salary) {
        super(name, salary);
    }
    void calculateBonus() {
        System.out.println(name + " received 20% bonus = " + (salary * 0.10));
    }
}
class Developer extends Employee{
    Developer(String name, double salary) {
        super(name, salary);
    }
    void calculateBonus() {
        System.out.println(name + " received 15% bonus = " + (salary * 0.10));
    }
}
public class EmployeeManagementDemo1 {
    public static void main(String [] args) {
    Employee e = new Employee("E", 50000);
    e.calculateBonus();
    Manager m = new Manager("M", 100000);
    m.calculateBonus();
    Developer d = new Developer("D", 80000);
    d.calculateBonus();
    }
}
