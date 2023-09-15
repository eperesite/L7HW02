
class Tram extends PublicTransport {

    public Tram(String name, int fuelConsumption, int baseCost) {
        super(name, fuelConsumption, baseCost);
    }

    @Override
    public int calculateCost() {

        int fuelCost = getFuelConsumption() * getOfficialFuelCost();
        return getBaseCost() + fuelCost;
    }

}
