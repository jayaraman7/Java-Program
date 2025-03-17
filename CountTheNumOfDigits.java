public class CountTheNumOfDigits {
	public static void main(String[] args) {
		int n=32781;
		int a =0;
		int count = 0;
		while(n!=0) {
			a=n%10;
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
