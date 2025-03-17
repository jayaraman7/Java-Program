public class Vowels {
	public static void main(String[] args) {
		String s="Hello";
		int len1 = s.length();
		char[] v={'a','e','i','o','u','A','E','I','O','U'};
		int len2 = v.length;
		int count = 0;
		String col="";
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(s.charAt(i)==v[j]) {
					col=col+v[j];
					count++;
				}
			}
		}
		
		System.out.println("The vowel count is :"+count);
		System.out.println("The vowels are:"+col);
		
	}
}
