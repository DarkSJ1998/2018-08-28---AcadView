/*
Q2. Create an Abstract Class Animals with color, breed and name as variables, along with eat() abstract method and also a speak() method which is not abstract.
*/

abstract class Animals
{
	protected String color, breed, name;
	
	abstract void eat();
	void speak()
	{
		System.out.println("\nI'm an Animal.");
		System.out.println("Name : " + name);
		System.out.println("Color : " + color);
		System.out.println("Breed : " + breed);
	}
}
class Cat extends Animals
{
	Cat(String color, String breed, String name)
	{
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	
	void eat()
	{
		System.out.println("\n< cat eating food >");
	}
}
class q2
{
	public static void main(String[] x)
	{
		Cat c = new Cat("Brown","Munchkin Cat","Tom");
		c.eat();
		c.speak();
		System.out.println();
	}
}