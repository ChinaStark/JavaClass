package work.weekFive;

abstract class Animal{
	abstract void cry();
	abstract String getAnimalname();
}

class Dog extends Animal{

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("Dog");
		
	}

	@Override
	String getAnimalname() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	
}

class Cat extends Animal{

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("Cat");
	}

	@Override
	String getAnimalname() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Simulator{
	void palySound(Animal animal){
		animal.cry();
	}
}


public class No_5 {
	
	public static void main(String args[]){
		Simulator simulator = new Simulator();
		simulator.palySound(new Dog());
		simulator.palySound(new Cat());
	}
}
