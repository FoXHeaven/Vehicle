public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("C001", "Toyota", "Corolla", 80.0, 4);
        vehicles[1] = new Car("C002", "Honda", "Civic", 90.0, 2);
        vehicles[2] = new Motorcycle("M001", "Yamaha", "MT-07", 50.0, 600);
        vehicles[3] = new Motorcycle("M002", "Kawasaki", "Ninja", 70.0, 1000);

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM" + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
            }

            System.out.println("---------------------");
        }
    }
}
