package Transport.model;

import java.util.Objects;

public class LightTransport extends Land {
	
	private String typeOfBody;
	private int numberOfPassengers;
	
	public String getTypeOfBody() {
		return typeOfBody;
	}
	public void setTypeOfBody(String typeOfBody) {
		this.typeOfBody = typeOfBody;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numberOfPassengers, typeOfBody);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LightTransport other = (LightTransport) obj;
		return numberOfPassengers == other.numberOfPassengers && Objects.equals(typeOfBody, other.typeOfBody);
	}
	@Override
	public String toString() {
		return "LightTransport [typeOfBody =" + typeOfBody + ", numberOfPassengers =" + numberOfPassengers
				+ ", countWheel =" + getCountWheel() + ", fuelConsumption =" + getFuelConsumption()
				+ ", power =" + getPower() + ", maxSpeed =" + getMaxSpeed() + ", weight =" + getWeight()
				+ ", brand =" + getBrand() + "]";
	}
	
	public String getTotalDescription() {
		double powerKv = getPowerKv();
		return "TotalDescription LightTransport: " + "typeOfBody =" + typeOfBody + ", numberOfPassengers =" + numberOfPassengers
				+ ", countWheel =" + getCountWheel() + ", fuelConsumption =" + getFuelConsumption()
				+ ", power =" + getPower() + ", maxSpeed =" + getMaxSpeed() + ", weight =" + getWeight()
				+ ", brand =" + getBrand() + ", powerKv = " + powerKv + "."; 
	}
	
	public double getPowerKv () {
		return getPower() * 0.74;
	}
	public int getMaxDistance(int time) {
		int maxDistance = time * getMaxSpeed();
		return maxDistance;
	}
	
	private int getConsuptionFeul (int time) {
		int consuptionFeul = (time * getMaxSpeed())/ getFuelConsumption();
		return consuptionFeul;
	}
	
	public void printDetails(int time) {
		System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью "
				+ getMaxSpeed() + " км/ч проедет " + getMaxDistance(time) + " км и израсходует "
				+ getConsuptionFeul(time) + " литров топлива.");
	}

}
