abstract class PublicTransport {

    private final String name;
    private final int fuelConsumption;
    public final int officialFuelCost = 3;
    public final int officialElectricityCost = 2;
    private final int baseCost;

    public PublicTransport(String name, int fuelConsumption, int baseCost) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.baseCost = baseCost;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public String getName() {
        return name;
    }

    public int getOfficialFuelCost() {
        return officialFuelCost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getOfficialElectricityCost() {
        return officialElectricityCost;
    }

    public abstract int calculateCost();

}
