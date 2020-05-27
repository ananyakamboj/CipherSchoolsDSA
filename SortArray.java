import java.util.*;
import java.lang.*;
import java.io.*;

public class SortArray {

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int count0=0,count1=0,count2=0;
		int t=sc.nextInt();//no. of testcases
		
		for(int i=1;i<=t;i++)//testcases loop
		{
		    count0=0;
		    count1=0;
		    count2=0;
		    int n=sc.nextInt();//size of array
		    int arr[]=new int[n];
		    
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		        if(arr[j]==2)
		        {
		            count2++;
		        }
		        else if(arr[j]==1)
		        {
		            count1++;
		        }
		        else
		        {
		            count0++;
		        }
		    }//for input
		    
    		    for(int k=1;k<=count0;k++)
    		    {
    		        System.out.print("0 ");
    		    }
    		    
    		    for(int k=1;k<=count1;k++)
    		    {
    		        System.out.print("1 ");
    		    }
    		    for(int k=1;k<=count2;k++)
    		    {
    		        System.out.print("2 ");
    		    }
    		    System.out.println();
		}
		
	}
}