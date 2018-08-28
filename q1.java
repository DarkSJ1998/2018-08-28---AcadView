/*
Q 1. Create an Interface called Animals with speak(), eat() methods. Create two classes Cat and Dog implementing their own versions of these methods.
*/

interface Animals
{
	void speak();
	void eat();
}
class Cat implements Animals
{
	public void speak()
	{
		System.out.println("I am a CAT");
	}
	public void eat()
	{
		System.out.println("< cat eating food >");
	}
}
class Dog implements Animals
{
	public void speak()
	{
		System.out.println("I am a DOG");
	}
	public void eat()
	{
		System.out.println("< dog eating food >");
	}
}
class q1
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		c.speak();
		c.eat();
		
		d.speak();
		d.eat();
	}
}