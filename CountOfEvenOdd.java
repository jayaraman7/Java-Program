public class CountOfEvenOdd {
	public static void main(String[] args) {
		int n=7;
		int count = 0;
		int count2 =0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				count++;
			}
			else {
				count2++;
			}
		}
		System.out.println("The even number count is:"+count);
		System.out.println("The odd number count is:"+count2);
	}
}
