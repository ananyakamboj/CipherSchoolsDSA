class Student{
	int roll_no;
	String name;
	Student(int roll_no,String name)
	{
		this.name=name;//iss class ka jo object banega usko initialize karo with value in the constructor
		this.roll_no=roll_no;
	}
}
public class object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Ananya");
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
	}

}
