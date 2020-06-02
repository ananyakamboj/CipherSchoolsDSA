import java.util.*;
public class arrayunsorted {
	
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(k==arr[i])
            {
                System.out.print("true");
                c=1;
            }
        }
        if(c==0)
       { System.out.println("false");}
    }
}