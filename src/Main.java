//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // ------ Task 1 ------
    Car myCar = new Car();
    myCar.brand = "Toyota";
    myCar.model = "Camry";
    myCar.year = 2000;
    System.out.println("Car: " + myCar.brand + " " + myCar.model + " (" + myCar.year + ")");

    // ------ Task 2 ------
    Student s1 = new Student("Fuad", 20);
    Student s2 = new Student("Ferid", 22);
    s1.DisplayInfo();
    s2.DisplayInfo();

    // ------ Task 3 ------
    Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 15.99);
    Book b2 = new Book("1984", "George Orwell");
    Book b3 = new Book();

    System.out.println(b1.getDetails());
    System.out.println(b2.getDetails());
    System.out.println(b3.getDetails());

    // ------ Task 4 ------
    Person p = new Person();
    p.setName("Nuraib Asgarov");
    p.setHeight(1.85);
    p.printInfo();

    // ------ Task 5 ------
    Engine v8 = new Engine(450);
    MotorVehicle sportsCar = new MotorVehicle(v8);
    sportsCar.startCar();

    // ------ Task 6 ------
    Rectangle rectangle = new Rectangle(5.0, 3.7);
    System.out.println("Area " + rectangle.getArea());
    System.out.println("Perimeter " + rectangle.getPerimeter());

    // ------ Task 7 ------
    Address addr1 = new Address("Kuce", "seher", "12313");
    Address addr2 = new Address("Kuce1", "seher4", "16313");

    Employee emp1 = new Employee("Sarah", 1245.2, addr1);
    Employee emp2 = new Employee("ALi", 2245.2, addr2);

    emp1.showEmployeeDetails();
    emp2.showEmployeeDetails();
}