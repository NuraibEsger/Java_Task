//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int age = 25;
    double price = 19.99;
    char initial = 'A';
    boolean isStudent = true;

    System.out.println("Age: " + age);
    System.out.println("Price: " + price);
    System.out.println("Initial: " + initial);
    System.out.println("Is Student: " + isStudent);

    System.out.println("--------------------------------");

    byte smallNumber = 100;
    short mediumNumber = 32000;
    int regularNumber = 100000;
    long largeNumber = 123456789L;
    float decimalNumber = 45.75f;
    double preciseNumber = 100.3456;

    System.out.println("Byte: " + smallNumber);
    System.out.println("Short: " + mediumNumber);
    System.out.println("Int: " + regularNumber);
    System.out.println("Long: " + largeNumber);
    System.out.println("Float: " + decimalNumber);
    System.out.println("Double: " + preciseNumber);

    System.out.println("--------------------------------");

    float result1 = age + decimalNumber;             // int + float
    double result2 = mediumNumber * preciseNumber;   // short * double
    double result3 = largeNumber / 1000.0;           // long / double

    System.out.println("Result of int + float: " + result1);
    System.out.println("Result of short * double: " + result2);
    System.out.println("Result of long / double: " + result3);

    System.out.println("--------------------------------");

    String fullName = "John Anderson";
    System.out.println("Full Name: " + fullName);

    System.out.println("--------------------------------");

    double originalValue = 12.99;
    int castedValue = (int) originalValue;

    System.out.println("Original double: " + originalValue);
    System.out.println("Casted int: " + castedValue);

    System.out.println("--------------------------------");

    char letter = 'Z';
    System.out.println("Character: " + letter);
    System.out.println("ASCII value: " + (int) letter);

    System.out.println("--------------------------------");

    boolean isAdult = true;
    boolean hasDrivingLicense = false;

    System.out.println("Is Adult: " + isAdult);
    System.out.println("Has Driving License: " + hasDrivingLicense);
}