import task1.Book;
import task1.Library;
import task2.Animal;
import task2.Elephant;
import task2.Lion;
import task2.Monkey;
import task3.Product;
import task3.ShoppingCart;
import task4.BankAccount;
import task4.CheckingAccount;
import task4.SavingsAccount;
import task5.GraduateStudent;
import task5.Student;
import task5.UndergraduateStudent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Task 1
    Library myLibrary = new Library(5);

    Book b1 = new Book("title 1", "Nuraib", 1866);
    Book b2 = new Book("title 2", "Viktor", 1862);
    Book b3 = new Book("title 3", "jane", 1988);

    myLibrary.addBook(b1);
    myLibrary.addBook(b2);
    myLibrary.addBook(b3);

    myLibrary.showAvailableBooks();
    b2.borrow();
    myLibrary.showAvailableBooks();
    b2.returnBook();
    myLibrary.showAvailableBooks();



    // Task 2
    Animal lion = new Lion();
    Animal elephant = new Elephant();
    Animal monkey = new Monkey();

    lion.makeSound();
    elephant.makeSound();
    monkey.makeSound();



    // Task 3
    Product p1 = new Product("Laptop", 1000.0);
    Product p2 = new Product("Mouse", 25.50);
    Product p3 = new Product("Keyboard", 50.0);

    ShoppingCart cart = new ShoppingCart(10);

    cart.addItem(p1, 1);
    cart.addItem(p2, 2);
    cart.showCart();
    cart.removeItem("Mouse");
    cart.addItem(p3, 1);
    cart.showCart();



    // Task 4
    BankAccount[] accounts = new BankAccount[2];

    accounts[0] = new SavingsAccount(100);
    accounts[1] = new CheckingAccount(200);

    for (BankAccount account : accounts) {
        account.withdraw(200);
    }


    // Task 5
    Student[] students = new Student[3];
    students[0] = new UndergraduateStudent("Ali", 85);
    students[1] = new GraduateStudent("Veli", 85, 10);
    students[2] = new GraduateStudent("Ferid", 90, 5);

    for (Student s : students) {
        System.out.println(s.getName() + ": " + s.getFinalGrade());
    }
}