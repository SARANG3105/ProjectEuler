
public class Prime {

	static long largePrime(long n) {
		long i=2;;
		while(i<n) {

			while(n%i==0) {
				n=n/i;
			}i++;

		}return i;
	}

	public static void main(String[] args) {
		long n=   600851475143L;
		System.out.println(Prime.largePrime(n));

	}
}
