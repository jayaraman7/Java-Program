public class FindTheGreatestnuminDigit {
	public static void main(String[] args) {
		int n =1532;
		int v = 0;
		int max=0;
		int min=0;
		while(n>0) {
			v=n%10;
			if(max<v) {
				max = v;
			}
			if(min<v) {
				v=min;
			}
			n=n/10;
		}
		System.out.println(max);
		System.out.println(min);
	}
}
