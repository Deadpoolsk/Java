class Heart {
	
	private float weight;
	private int bpm;
	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}
	public float getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
	
	
}

class Brain {
	
	private float weight;
	private String color;
	public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	} 
}

class Bike {
	
	private String name;
	private int milage;
	public Bike(String name, int milage) {
		super();
		this.name = name;
		this.milage = milage;
	}
	public String getName() {
		return name;
	}
	public int getMilage() {
		return milage;
	}
}

class Book {
	
	private String name;
	private String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}

class Student {
	
	Heart h = new Heart(300.5f,74);
	Brain b = new Brain (1400,"Red");
	
	void hasA(Bike b) {
		System.out.println("Bike name = " + b.getName());
		System.out.println("Bikes milage = " + b.getMilage());
	}
	void hasA(Book b) {
		System.out.println("Book name = " + b.getName());
		System.out.println("Author's name = " + b.getAuthor());
	}
}


public class Polymorphism01 {

	public static void main(String[] args) {
		
		Student s = new Student();
		Bike b1 = new Bike("Duke", 35);
		Book b2 = new Book("Java", "James Gosling");
		
		System.out.println("Heart weight = " + s.h.getWeight());
		System.out.println("HeartBeat = " + s.h.getBpm());
		System.out.println();
		
		System.out.println("Brain Weigth = " + s.b.getWeight());
		System.out.println("Brain color" + s.b.getColor());
		System.out.println();

		s.hasA(b1);
		s.hasA(b2);
		System.out.println();
		
		s = null;
		
//		System.out.println(s.h.getWeight());
//		System.out.println(s.h.getBpm());
//		
//		System.out.println(s.b.getWeight());
//		System.out.println(s.b.getColor());
		
//		s.hasA(b1);
//		s.hasA(b2);
		
		System.out.println("Bike name = " + b1.getName());
		System.out.println("Bikes milage = " + b1.getMilage());
		
		System.out.println("Book name = " + b2.getName());
		System.out.println("Author's name = " + b2.getAuthor());
	}

}
