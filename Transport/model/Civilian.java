package Transport.model;

import java.util.Objects;

public class Civilian extends Air {
	private int numberOfPassengers;
    private boolean bissnesClass;
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public boolean isBissnesClass() {
		return bissnesClass;
	}
	public void setBissnesClass(boolean bissnesClass) {
		this.bissnesClass = bissnesClass;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bissnesClass, numberOfPassengers);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Civilian other = (Civilian) obj;
		return bissnesClass == other.bissnesClass && numberOfPassengers == other.numberOfPassengers;
	}
    
	public double getPowerKv () {
		return getPower() * 0.74;}
		
	public String getTotalDescription() {
		double powerKv = getPowerKv();
		return "TotalDescription: " + "numberOfPassengers =  " + numberOfPassengers + ", bissnesClass = " + bissnesClass
				+ ", wingspan = " + getWingspan() + ", minRunway = " + getMinRunway() + ", power = " + getPower()
				+ ", maxSpeed = " + getMaxSpeed() + ", weight = " + getWeight() + ", brand = " + getBrand()
				+ ", powerKv = " + powerKv + ".";}
	
	
	public void printPassengerCapacity(int passengerCapacity ) {
		if (numberOfPassengers <= passengerCapacity) {
			System.out.println("Civilian transport is loaded.");
		} else {
			System.out.println("You need a bigger Civilian transport.");
	}
		
	}
	
}


