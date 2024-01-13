package typesOfNestedClass;

public class StaticInnerClassExecution {
	public static void main(String[] args) {
		OuterWithStaticInnerClass.StaticInnerClass obj = new OuterWithStaticInnerClass.StaticInnerClass();
		obj.print();
	}
	
	//no need to instantiate the outer class
	//static class can access the static members of the outer class
	//static class cannot access instance variables of the outer class

}
