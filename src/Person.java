public class Person {
    private String name;
    private double height;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else  {
            System.out.println("Height cannot be negative");
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
    }
}
