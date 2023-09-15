
class Metro extends PublicTransport {

    public Metro(String name, int fuelConsumption, int baseCost) {
        super(name, fuelConsumption, baseCost);
    }

    @Override
    public int calculateCost() {
        int electricityCost = getFuelConsumption() * getOfficialElectricityCost();
        return getBaseCost() + electricityCost;
    }

}
