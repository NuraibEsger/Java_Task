//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws CustomException {
    // Task 1
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    try{
        int res = DivideByZero(num1,num2);
        System.out.println(res);
    } catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }

    // Task 2

    int[] arr = {1, 2, 3, 4, 5};

    try{
        for(int i = 0; i <= arr.length; i++){
            System.out.println(arr[i]);
        }
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }

    // Task 3
    String s1 = "12";
    try{
        var a = Integer.parseInt(s1);
        System.out.println(a);
    } catch(NumberFormatException e){
        System.out.println(e.getMessage());
    }

    // Task 4
    try{
        int[] numbers = {1, 2, 3};

        System.out.println(numbers[10]);
    } catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.getClass().getName());
    }

    // Task 5
    try {
        int a = 10;
        int b = 0;

        String text = null;
        System.out.println(text.length());

    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    } catch (NullPointerException e) {
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    // Task 6
    try {
        System.out.println("1. Inside try block");

        int result = 10 / 0;

        System.out.println(result);

    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());

    } finally {
        System.out.println("finally block executed");
    }

    // Task 7
    var age = sc.nextInt();

    if (age < 0 || age > 120) {
        throw new RuntimeException("Age must be between 0 and 120");
    }

    // Task 8
    if (age < 18){
        throw new InvalidAgeException("Age must be between 18 and 120");
    }

    // Task 9
    System.out.println("Program start");
    method1();
    System.out.println("Program end");

    // Task 11
    BankAccount bankAccount = new BankAccount(420, 400);
    if (bankAccount.withdraw > bankAccount.balance) {
        throw new CustomException("withdraw is more than balance");
    }

    try {
        processWithdrawal(5000);

    } catch (Exception e) {
        System.out.println("=== EXCEPTION LOGGING ===");

        System.out.println("1. MESSAGE: " + e.getMessage());

        System.out.println("2. CAUSE: " + e.getCause());

        System.out.println("3. STACK TRACE: ");
        e.printStackTrace();
    }
}

private int DivideByZero(int a, int b) {
    return a / b;
}


private static class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

static void method1(){
    try{
        method2();
    } catch(RuntimeException e){
        System.out.println(e.getMessage());
    }
}

static void method2() {
    method3();
}

static void method3() {
    throw new RuntimeException("Error occurred in method3");
}

// Task 10
public void ExceptionMethod() throws ClassNotFoundException {
    throw new ClassNotFoundException();
}

// Task 11
static class BankAccount  {
    Integer withdraw;
    Integer balance;
    BankAccount(Integer withdraw, Integer balance) {
        this.withdraw = withdraw;
        this.balance = balance;
    }
}

static class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

static class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

static class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String message, Throwable cause) {
        super(message, cause);
    }
}

static void processWithdrawal(int amount)
        throws InvalidPinException, InsufficientBalanceException, DailyLimitExceededException {

    int dailyLimit = 2000;

    if (amount > dailyLimit) {
        // Simulating a deeper system error to serve as the 'Cause'
        NullPointerException rootCause = new NullPointerException("Simulated internal system error");

        // Throw the custom exception, attaching the root cause
        throw new DailyLimitExceededException("You cannot withdraw more than " + dailyLimit, rootCause);
    }
}