package Transport.main;

import Transport.model.Army;
import Transport.model.Civilian;
import Transport.model.LightTransport;
import Transport.model.Transport;
import Transport.model.Truck;

public class App {

	public static void main(String[] args) {
		
		LightTransport lightTransport = new LightTransport();
		lightTransport.setBrand("Porshe");
		lightTransport.setCountWheel(4);
		lightTransport.setFuelConsumption(10);
		lightTransport.setMaxSpeed(250);
		lightTransport.setNumberOfPassengers(4);
		lightTransport.setPower(100);
		lightTransport.setTypeOfBody("Coupe");
		lightTransport.setWeight(1250);
		lightTransport.printDetails(100);
		System.out.println(lightTransport.getTotalDescription());
		System.out.println();
		
		Truck truck = new Truck();
		truck.setCountWheel(6);
		truck.setFuelConsumption(10);
		truck.setPower(60);
		truck.setPayload(5);
		System.out.println(truck.getTotalDescription());
		truck.printPayloadTruck(10);
		System.out.println();
		truck.setPayload(20);
		truck.printPayloadTruck(10);
		
		Civilian civilian = new Civilian();
		civilian.setBrand("Boing");
		civilian.setMaxSpeed(600);
		civilian.setBissnesClass(true);
		civilian.setNumberOfPassengers(100);
		System.out.println();
		System.out.println(civilian.getTotalDescription());
		civilian.printPassengerCapacity(130);
		System.out.println();
		civilian.printPassengerCapacity(90);
		
		Army army = new Army();
		System.out.println();
		System.out.println(army.getTotalDescription());
		army.setBrand("Stels");
		army.setMaxSpeed(1000);
		army.setMinRunway(1000);
		army.setNumberOfMissilesOnBoard(15);
		army.setPower(250);
		army.setTheyveSabotaged(false);
		army.setWeight(5000);
		army.setWingspan(10);
		System.out.println(army.getTotalDescription());
		army.printShot(15);
		army.printEjection(false);
		System.out.println();
		army.printShot(0);
		army.printEjection(true);
		
}
}