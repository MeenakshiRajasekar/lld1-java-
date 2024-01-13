package typesOfNestedClass;

public class OuterWithStaticInnerClass {
	private static int value =0;
	private int privateVariable = 123;
	
	public static class StaticInnerClass{
		 void print() {
			System.out.println("value of outerclass is : "+value);
		}
	}
	
	
}
