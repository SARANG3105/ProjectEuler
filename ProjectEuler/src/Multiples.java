import java.util.ArrayList;

/*Q: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.*/
public class Multiples {
public static void main(String args[]) {
	//ArrayList<Integer> arr= new ArrayList<Integer>();
	int[] arr= new int[1000];
	for(int i=0; i<1000;i++) {
		if(i%3==0 || i%5==0) {
			//arr.add(i);
			arr[i]=i;
		}
	}int sum=0;
	
	for(int j=0; j<arr.length;j++) {
		sum+=arr[j];
		//sum+=arr.get(j);
	}
	System.out.println(sum);
}
}
