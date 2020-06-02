class A{
	void print()
	{
		System.out.println("Hi, I am A and my hashcode is "+this.hashCode());
	}
}
class B extends A
{
	void print()
	{
		System.out.println("Hi, I am B and my hashcode is "+this.hashCode());
	}
}
public class hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		
		a.print();
		b.print();
		
		B b1=new B();
		b1.print();
		
	}

}
