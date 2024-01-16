package functionalInterfaceDemo;

//no need to use implements keyword to implement the MathsOperation interface
public class Calculator {
	public static void main(String[] args) {
		MathsOperation add = ( a,  b) -> 	a+b;
		System.out.println(add.operate(10,3));
		
		MathsOperation sub = (a, b) -> a-b;
		System.out.println(sub.operate(10, 5));
		
		MathsOperation mul = (a,b) -> a*b;
		System.out.println(mul.operate(2, 4));
		MathsOperation div = (a, b) -> a/b;
		System.out.println(div.operate(10, 2));
	}
	
}
