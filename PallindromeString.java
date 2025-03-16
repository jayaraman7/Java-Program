class Main {
    public static void main(String[] args) {
        String s ="MADAM";
        String rev ="";
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
             System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
    }
}
