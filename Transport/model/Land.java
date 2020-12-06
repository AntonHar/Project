package Transport.model;

public abstract class Land extends Transport{

	private int countWheel;
    private int fuelConsumption;
	
    public int getCountWheel() {
		return countWheel;
	}
	public void setCountWheel(int countWheel) {
		this.countWheel = countWheel;
	}
	public int getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	@Override
	public String toString() {
		return "Lang [countWheel =" + countWheel + ", fuelConsumption =" + fuelConsumption + ", Power =" + getPower()
				+ ", MaxSpeed =" + getMaxSpeed() + ", weight =" + getWeight() + ", brand =" + getBrand()
				+ "]";
	}
    
    
}
