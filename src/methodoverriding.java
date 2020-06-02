class Parent
{
	int age=40;
	void print()
	{
		System.out.println("This is parent class and age is "+age);
	}
}
class Child extends Parent
{
	int age=20;
	 void print()
	{
		System.out.println("This is child class and age is "+age);
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Parent();
		Child c=new Child();
		p.print();
		c.print();//child method is given preference and function overriding is called as run time polymorphism.
		
		
	}

}
