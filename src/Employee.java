public class Employee {
    String name;
    double salary;
    Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Address: " + address.toString());
    }
}
