/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
public class anagram {

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    String a=sc.next();
		    String b=sc.next();
		    int flag=0;
		    if(a.length()==b.length())
		    {
		        int fa[]=new int[26];
		        int fb[]=new int[26];
		        for(int i=0;i<a.length();i++)
		        {
		            int index=a.charAt(i)-'a';
		            fa[index]++;
		        }
		        for(int i=0;i<b.length();i++)
		        {
		            int index=b.charAt(i)-'a';
		            fb[index]++;
		        }
		        for(int i=0;i<26;i++)
		        {
		            if(fa[i]!=fb[i])
		            {
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}