
// Класс парка общественного транспорта
public class PublicTransportPark {

    private final PublicTransport[] vehicles;

    public PublicTransportPark(PublicTransport[] vehicles) {
        this.vehicles = vehicles;
    }

    public int calculateTotalCost() {
        int totalCost = 0;
        for (PublicTransport vehicle : vehicles) {
            totalCost += vehicle.calculateCost();
        }
        return totalCost;
    }


    public void findVehiclesInRange(int minFuelConsumption, int maxFuelConsumption) {
        System.out.println("\nТранспортные средства в диапазоне расхода топлива от " + minFuelConsumption + " до " + maxFuelConsumption + ":");

        for (int i = 0; i < vehicles.length; i++) {
            int fuelConsumption = vehicles[i].getFuelConsumption();
            if (fuelConsumption >= minFuelConsumption && fuelConsumption <= maxFuelConsumption) {
                System.out.println(vehicles[i].getName());
            }
        }
    }

    public void sortByFuelConsumption() {
        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 0; j < vehicles.length - i - 1; j++) {
                if (vehicles[j].getFuelConsumption() > vehicles[j + 1].getFuelConsumption()) {
                    PublicTransport temp = vehicles[j];
                    vehicles[j] = vehicles[j + 1];
                    vehicles[j + 1] = temp;
                }
            }
        }
    }


}

