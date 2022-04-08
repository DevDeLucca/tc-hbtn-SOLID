public class Motorcycle extends Vehicle implements IVehicleMotorcycle{

    public Motorcycle(String color, String year, double engine) {

        configureVehicle(color, year, engine);
    }

    @Override
    public void configureVehicle(String color, String year, double engine) {
        System.out.println("Criando uma moto com Interface: " + color + " " + engine);
    }

    @Override
    public void startVehicle() {
        super.startVehicle();
    }
}
