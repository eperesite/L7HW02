public class Main {
    public static void main(String[] args) {

        PublicTransport[] vehicles = new PublicTransport[]{
                new Bus("Автобус 1", 10, 1202),
                new Bus("Автобус 2", 15, 2515),
                new Bus("Автобус 3", 25, 5155),
                new Metro("Метро 1", 5, 54545151),
                new Metro("Метро 2", 8, 5548464),
                new Tram("Трамвай 1", 8, 54545),
                new Tram("Трамвай 2", 9, 55222),
                new Trolleybus("Троллейбус 1", 12, 2212),
                new Trolleybus("Троллейбус 2", 10, 515454)
        };

        PublicTransportPark park = new PublicTransportPark(vehicles);

        int totalCost = park.calculateTotalCost();
        System.out.println("\nОбщая стоимость автопарка: " + totalCost + " BYN");

        park.sortByFuelConsumption();
        System.out.println("\nТранспортные средства, отсортированные по расходу топлива:");
        for (PublicTransport vehicle : vehicles) {
            System.out.println(vehicle.getName() + " - Расход топлива: " + vehicle.getFuelConsumption() + "л");
        }

        int minFuelConsumption = 7;
        int maxFuelConsumption = 11;
        park.findVehiclesInRange(minFuelConsumption, maxFuelConsumption);
    }

}
