class Airoplane{	
	void fly() {
		System.out.println("plane is flying...");
	}
}

class Cargo extends Airoplane{
	
	void fly() {
		System.out.println("cargo plane is flying at low height...");
	}
	void carryCargo() {
		System.out.println("cargo plane is carrying cargo...");
	}
}

class Passenger extends Airoplane{
	
	void fly() {
		System.out.println("passenger plane is flying at medium height...");
	}
	void carryPassenger() {
		System.out.println("passenger plane is carrying passenger...");
	}
}

class Fighter extends Airoplane{
	
	void fly() {
		System.out.println("fighter plane is flying at great height...");
	}
	void carryWeapon() {
		System.out.println("fighter plane is carrying weapon...");
	}
}

class Airport{
	
	void permit(Plane ref) {
		ref.fly();
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
//		TIGHT COUPLING :- creating child type reference to child objects is known as tight coupling
		Cargo cp = new Cargo();
		Passenger pp = new Passenger();
		Fighter fp = new Fighter();
		
		Airoplane ref;
//		LOOSE COUPLING :- creating parent type reference to child objects is known as tight coupling
		ref = cp;
		ref.fly();
//		UPCASTING :- converting child type reference to parent type reference is known as UPCASTING
//		DOWNCASTING :- converting parent type reference to child type reference is known as DOWNCASTING
		((Cargo)(ref)).carryCargo();
		System.out.println();
		
//		LOOSE COUPLING
		ref = pp;
		ref.fly();
		((Passenger)(ref)).carryPassenger();
		System.out.println();
		
//		LOOSE COUPLING
		ref = fp;
		ref.fly();
		((Fighter)(ref)).carryWeapon();
		
	}
}
