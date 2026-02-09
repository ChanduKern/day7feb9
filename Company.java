class Employee {
    String name;
    int salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
}

class Manager extends Employee {
}

public class Company {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Rahul";
        d.salary = 50000;
        d.displayDetails();

        Manager m = new Manager();
        m.name = "Anita";
        m.salary = 70000;
        m.displayDetails();
    }
}
