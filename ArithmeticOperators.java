package week1.day2;

public class ArithmeticOperators {
	String name="KARTHIK" ;
	
	public void add(){
		int a=100;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=25;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	public void multi() {
		int a= 10;
		int b= 10;
		int c= a*b;
		System.out.println(c);
	}
	public void div() {
		int a=30;
		int b= 3;
		int c= a/b;
		System.out.println(c);
}
 public static void main(String[] args) {
	ArithmeticOperators arith=new ArithmeticOperators();
	System.out.println(arith.name);
	arith.add();
	arith.sub();
	arith.div();
	arith.multi();
}
}

