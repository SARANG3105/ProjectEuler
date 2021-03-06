import java.util.Arrays;
import java.util.Scanner;

/*Q: Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
By starting with 1 and 2, the first 10 terms will be:1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.*/


public class FibonacciSeq {
	static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}else {
				continue;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		int[] arr=new int[n];
		arr[0]=1;arr[1]=2;
		for(int i=0;i<n-2;i++) {
			arr[i+2]=arr[i]+arr[i+1];
		
		}
		if(arr[n-1]<4000000) {
		System.out.println("Sum: "+FibonacciSeq.sum(arr));}
		else {
			System.out.println("Invalid n");
		}
		in.close();
	}
}
