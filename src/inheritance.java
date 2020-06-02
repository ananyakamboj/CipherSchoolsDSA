class Animal{
	 void hello()
	 {
		 System.out.println("I am an animal.");
	 }
}
class Dog extends Animal
{
	void hello()
	{
		System.out.println("I am a dog.");
	}
}
public class inheritance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a=new Animal();
		Dog b= new Dog();
		
		a.hello();
		//b.name();
		b.hello();
		//a.name();
		//compile time error
		
		
		
	}

}
