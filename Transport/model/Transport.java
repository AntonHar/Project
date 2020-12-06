package Transport.model;

import java.util.Objects;

public abstract class Transport {
	
	private int power;
	 private int maxSpeed;
	 private int weight;
	 private String Brand;
	
	 public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Brand, maxSpeed, power, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		return Objects.equals(Brand, other.Brand) && maxSpeed == other.maxSpeed && power == other.power
				&& weight == other.weight;
	}
	 
	 
}
