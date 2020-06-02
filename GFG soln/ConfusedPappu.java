import java.io.*;
import java.util.*;

public class ConfusedPappu {

		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int t=sc.nextInt();//no. of testcases
			for(int i=1;i<=t;i++)
			{
			    int n=sc.nextInt();//Actual amount;
			    
			    String s=String.valueOf(n);
			    //System.out.println(s);
			    int s_int=Integer.parseInt(s);
			    //System.out.println(s_int);
			    String s1=s.replace('6','9');
			    //System.out.println(s1);
			    int s1_int=Integer.parseInt(s1);
			    int sf=(+(s1_int-s_int));
			   // String sf=(int)s1-(int)s;
			    System.out.println(sf);
			}
			
		}
}
