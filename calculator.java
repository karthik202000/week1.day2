package week1.day2;

public class calculator {
	public int add(int a,int b) {
	int total=a+b;
	return total;
}
    public void sub(int totalvalues,int d) {
    	int x=totalvalues-d;
    	System.out.println(x);
    }
    public static void main(String[] args) {
		calculator obj=new calculator();
		int totalvalues=obj.add(100, 10);
		System.out.println(totalvalues);
		obj.sub(totalvalues,20);
	}
}
