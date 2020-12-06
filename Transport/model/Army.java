package Transport.model;

import java.util.Objects;

public class Army extends Air {
	
	private boolean theyveSabotaged;
	private int numberOfMissilesOnBoard;
	
	public boolean isTheyveSabotaged() {
		return theyveSabotaged;
	}
	public void setTheyveSabotaged(boolean theyveSabotaged) {
		this.theyveSabotaged = theyveSabotaged;
	}
	public int getNumberOfMissilesOnBoard() {
		return numberOfMissilesOnBoard;
	}
	public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
		this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numberOfMissilesOnBoard, theyveSabotaged);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Army other = (Army) obj;
		return numberOfMissilesOnBoard == other.numberOfMissilesOnBoard && theyveSabotaged == other.theyveSabotaged;
	}
	
	public double getPowerKv () {
		return getPower() * 0.74;}
		
	public String getTotalDescription() {
		double powerKv = getPowerKv();
		return "TotalDescription Army Air Transport: " + "theyveSabotaged =  " + theyveSabotaged
				+ ", numberOfMissilesOnBoard = " + numberOfMissilesOnBoard + ", wingspan = " + getWingspan()
				+ ", minRunway = " + getMinRunway() + ", power = " + getPower() + ", maxSpeed = " + getMaxSpeed()
				+ ", weight = " + getWeight() + ", brand = " + getBrand() + ", powerKv = " + powerKv + ".";
	}
	
	public void printShot(int numberOfMissilesOnBoard) {
		if (numberOfMissilesOnBoard > 0) {
			System.out.println("The rocket flew, left " + (numberOfMissilesOnBoard = numberOfMissilesOnBoard - 1 ) + " rockets ");
		} else { if (numberOfMissilesOnBoard == 0) {
			System.out.println("No ammunition available.");
		} else {
			System.out.println("System error");}
	    }
	}

	public void printEjection(boolean theyveSabotaged ) {
		if (theyveSabotaged == true) {
			System.out.println("The ejection was successful.");
		} else {
			System.out.println("You don't have such a system!!!");
		}
	}
	
}
	
	
	


