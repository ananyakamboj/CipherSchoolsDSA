class Shape{//Parent class / Base Class/Super Class 
	double pi = 3.14;
	int getSquare(int a){
		return a*a;
	}
}
class Circle extends Shape{//Child Class/Derived Class/Sub Class
	int r=5;
	double getArea()
	{
		double area = pi * getSquare(r);
		return area;
	}
}
class Cylinder extends Shape{
	int r=5;
	int h=2;
	double getVolume(){
		return pi * getSquare(r)*h;
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println(c.getArea());
		Cylinder cyl = new Cylinder();
		System.out.println(cyl.getVolume());
	}
	

}