public class Engine {
    int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("Starting Engine with horse power " + horsePower);
    }
}
