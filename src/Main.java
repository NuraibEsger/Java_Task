//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
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
}

private int DivideByZero(int a, int b) {
    return a / b;
}