package ASSIGNMENTS;

public class Assignment1_2 {
//Write a program to print the result of the following expressions provided the integer variable a is
//	20 and b is 10.
//	int b= a-- - --a;
//	int c=a--;
//	int d=a>>2;
//	int e=a&b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		
		System.out.println("Default Values 			: a="+a+" and b="+b);
		b=a-- - --a;
		System.out.println("Result of b= a-- - --a 		: a="+a+" and b="+b);
		int c=a--;
		System.out.println("Result of c=a--  		: a="+a+" and c="+c);
		int d=a>>2;
		System.out.println("Result of d=a>>2  		: a="+a+" and d="+d);
		int e=a&b;
		System.out.println("Result of e=a&b  		: a="+a+" and b="+b+" and e:"+e);		
	}

}
