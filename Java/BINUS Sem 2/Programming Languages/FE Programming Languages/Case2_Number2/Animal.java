package Case2_Number2;

// animal class
class Animal {

	private String name;
	private int weight;
	
}

// class to create a lion object
class Lion extends Animal{
	
	private String name;
	private int weight;
	private int consumes;

	Lion(String name, int weight, int consumes) {
		this.name = name;
		this.weight = weight;
		this.consumes = consumes;
	}
	public String getName() {
		return this.name;	
	}
	public int getWeight() {
		return this.weight;	
	}
	public int getConsumes() {
		return this.consumes;	
	}
	
	public String toString()
	{
		return getName() +", "+ getWeight() +", "+ getConsumes();
	}
}

//class to create a snake object
class Snake extends Animal{
	
	private String name;
	private int weight;
	private int length;

	Snake(String name, int weight, int length) {
		this.name = name;
		this.weight = weight;
		this.length = length;
	}
	public String getName() {
		return this.name;	
	}
	public int getWeight() {
		return this.weight;	
	}
	public int getLength() {
		return this.length;	
	}
	
	public String toString()
	{
		return getName() +", "+ getWeight() +", "+ getLength();
	}
}

//class to create a monkey object
class Monkey extends Animal{
	
	private String name;
	private int weight;
	private String favFood;

	Monkey(String name, int weight, String favFood) {
		this.name = name;
		this.weight = weight;
		this.favFood = favFood;
	}
	
	public String getName() {
		return this.name;	
	}
	public int getWeight() {
		return this.weight;	
	}
	public String getFavFood() {
		return this.favFood;	
	}
	
	public String toString()
	{
		return getName() +", "+ getWeight() +", "+ getFavFood();
	}
}

// driver class to run the codes
class driver{
	
	public static void main(String args[]) 
	{
		Lion leo = new Lion("Leo", 300, 5);
		Snake ana = new Snake("Ana", 50, 5);
		Monkey george = new Monkey("George", 120, "Kiwi");
		
		System.out.println(leo.toString());
		System.out.println(ana.toString());
		System.out.println(george.toString());
	}
}




