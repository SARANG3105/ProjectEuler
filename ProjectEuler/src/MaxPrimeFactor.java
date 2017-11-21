
public class MaxPrimeFactor {
	static boolean isPrime(long i) {
		long j=2;
		while(j<i) {
			if(i%j==0) {
				return false;
			}
			j++;
		}return true;
	}
		static long largePrime(long n) {
			int i=2;
			while(i<n) {
				if(n%i==0 && isPrime(i)==true) {
					n=n/i;
				}
				i++;
			}return i;
		}

	public static void main(String[] args) {
		long n=  10L;
		System.out.println(MaxPrimeFactor.largePrime(n));

	}
}
