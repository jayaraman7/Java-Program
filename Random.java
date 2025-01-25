class Random{
public static void main(String[] args){
int n=10;
int a = (int)(Math.random()*n);
int b = (int)(Math.random()*n);
int c = a + b;
System.out.println("The first num is: "+ a);
System.out.println("The second num is: "+ b);
System.out.println("The Result is: "+ c);
}
}