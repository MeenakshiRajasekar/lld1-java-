package typesOfNestedClassInnerClass;

public class Main {
	
	public static void main(String[] args) {
		OuterClassWithInnerClass obj = new OuterClassWithInnerClass();
		OuterClassWithInnerClass.InnerClass inObj = obj.new InnerClass();
		String key = inObj.gettingAccessofPrivateMembers();
		System.out.println("private key is : "+ key); 
	}

	//to access the private member of outer class, inner class helps
}
