public class MotorVehicle {
    Engine engine;

    public MotorVehicle(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Key turned");
        engine.startEngine();
        System.out.println("Car is ready to drive");
    }
}
