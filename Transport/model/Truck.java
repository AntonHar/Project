package Transport.model;

import java.util.Objects;

public class Truck extends Land {
	
	private int payload;
	
	public int getPayload() {
		return payload;
	}
	public void setPayload(int payload) {
		this.payload = payload;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(payload);
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
		Truck other = (Truck) obj;
		return payload == other.payload;
	}
	public double getPowerKv () {
		return getPower() * 0.74;
	}
	
	public String getTotalDescription() {
		double powerKv = getPowerKv();
		return "TotalDescription Truck: " + "payload = " + payload + ", countWheel = " + getCountWheel() + ", fuelConsumption = "
				+ getFuelConsumption() + ", power = " + getPower() + ", maxSpeed = " + getMaxSpeed() + ", weight = "
				+ getWeight() + ", brand = " + getBrand() + ", powerKv = " + powerKv + ".";
	}
	
	public void printPayloadTruck(int payloadTruck ) {
		if (payload <= payloadTruck ) {
			System.out.println("The truck is loaded");}
		else {System.out.println(" You need a bigger truck");
		}
	}
	
}
