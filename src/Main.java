//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Task 1
    Calculator addition = (a, b) -> a+b;
    Calculator multiplication = (a, b) -> a*b;

    int result1 = addition.operate(5, 3);
    int result2 = multiplication.operate(5, 4);

    System.out.println(result1);
    System.out.println(result2);

    // Task 2
    checkDay(Day.Monday);
    checkDay(Day.Sunday);

    // Task 3
    TrafficLight currentTrafficLight = TrafficLight.Red;

    switch (currentTrafficLight) {
        case Red:
            System.out.println("Red light");
            break;
        case Yellow:
            System.out.println("Yellow light");
            break;
        case Green:
            System.out.println("Green light");
            break;
    }
}

public static void checkDay(Day day) {
    if (day == Day.Saturday || day == Day.Sunday) {
        System.out.println(day + " is a Weekend.");
    } else {
        System.out.println(day + " is a Weekday.");
    }
}