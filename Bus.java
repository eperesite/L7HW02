class Bus extends PublicTransport {

    public Bus(String name, int fuelConsumption, int baseCost) {
        super(name, fuelConsumption, baseCost);
    }

    @Override
    public int calculateCost() {

        int fuelCost = getFuelConsumption() * getOfficialFuelCost();

        return getBaseCost() + fuelCost;
    }

}
