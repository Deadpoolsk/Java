class Plane{
	
	void takeOff() {
		System.out.println("plane is taking off...");
	}
	void fly() {
		System.out.println("plane is flying...");
	}
	void land() {
		System.out.println("plane is landing...");
	}
}

class CargoPlane extends Plane{

//	OVERRIDDEN METHOD
	void fly() {
		System.out.println("Cargo Plane is flying at low height...");
	}
//	SPECIALISED METHOD
	void carryCargo() {
		System.out.println("Cargo Plane is carrying goods...");
	}
}

class PassengerPlane extends Plane{
	
//	OVERRIDDEN METHOD
	void fly() {
		System.out.println("Passenger Plane is flying at medium height...");
	}
//	SPECIALISED METHOD	
	void carryPassenger() {
		System.out.println("Cargo Plane is carrying passenger...");
	}
}

class FighterPlane extends Plane{
	
//	OVERRIDDEN METHOD
	void fly() {
		System.out.println("Cargo Plane is flying at higher height...");
	}
//	SPECIALISED METHOD
	void carryWeapon() {
		System.out.println("Cargo Plane is carrying weapons...");
	}
}


public class Inheritance01 {
	
	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.carryCargo();
		cp.land();
		System.out.println();
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.carryPassenger();
		pp.land();
		System.out.println();
		
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.carryWeapon();
		fp.land();
	}

}
