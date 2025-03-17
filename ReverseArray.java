import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		int[] n = {1,2,3,4};
		int right= n.length-1;
		int left =0;
		while(left<right) {
			int temp=n[left];
			n[left]=n[right];
			n[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(n));
	}
}
