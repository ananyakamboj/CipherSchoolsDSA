class Students
{
	String name;
	int rollNo;
	Students(String name,int rollNo)
	{
		this.name=name;
		this.rollNo = rollNo;
	}
	void printHashCode(){
		System.out.println(this.hashCode());
	}
	
}
public class hashcode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("ram",1);
		Students s2 = new Students("Sham",2);
		s1.printHashCode();
		s2.printHashCode();
		Students s3=s1;
		s3.printHashCode();
	}

}