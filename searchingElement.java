import java.util.*;
import java.lang.*;
import java.io.*;
public class searchingElement {
	public static void main (String[] args) 
	{
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//no. of testcases
		
		
		for(int i=1;i<=t;i++)//loop for testcases
		{

		    int n=sc.nextInt();//size of array
		    int k=sc.nextInt();//number to be searched
		    int arr[]=new int[n];//making a new array of size n
		    
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++)
		    {
		        if(arr[j]==k)
		        {
		            System.out.println(j+1);
		            break;
		        }
		        if(j==n-1&&arr[j]!=k)
		        {
		             System.out.println(-1);
		        }
		    }
		    
		}
		System.out.println();
		
	}
}