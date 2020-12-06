package Transport.model;

import java.util.Objects;

public abstract class Air extends Transport {
	 private int wingspan;
	 private int minRunway;
	
	 public int getWingspan() {
		return wingspan;
	}
	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}
	public int getMinRunway() {
		return minRunway;
	}
	public void setMinRunway(int minRunway) {
		this.minRunway = minRunway;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(minRunway, wingspan);
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
		Air other = (Air) obj;
		return minRunway == other.minRunway && wingspan == other.wingspan;
	}
	@Override
	public String toString() {
		return "Air [wingspan=" + wingspan + ", minRunway=" + minRunway + ", getPower()=" + getPower()
				+ ", getMaxSpeed()=" + getMaxSpeed() + ", getWeight()=" + getWeight() + ", getBrand()=" + getBrand()
				+ "]";
	}
	
	 
	 
	 

}
