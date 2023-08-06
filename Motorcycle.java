public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRate, int engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int calculateTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (calculateTopSpeed() >= 300) {
            return super.calculateRentalCost(days) + 150;
        }
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity;
    }
}