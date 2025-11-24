public class Student {
    String Name;
    Integer Age;

    Student(String Name,Integer Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public void DisplayInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
    }
}
