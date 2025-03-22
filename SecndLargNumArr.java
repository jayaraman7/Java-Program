import java.util.Arrays;
public class SecondLargArr {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,78};
		int len = a.length;
		if(len<2) {
			System.out.println("Invalid input");
		}
		Arrays.sort(a);
		for(int i=len-2;i>=0;i--) {
			if(a[i]!=a[len-1]) {
				System.out.println("The Secnd largest num is :"+a[i]);
				break;
			}
		}
		System.out.println("All numbers are same");
	}
}
