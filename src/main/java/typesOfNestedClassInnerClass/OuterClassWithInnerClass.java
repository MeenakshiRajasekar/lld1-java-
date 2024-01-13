package typesOfNestedClassInnerClass;

public class OuterClassWithInnerClass {
	 private int value =10;
	 private String key = "Admin";
	 
	  class InnerClass{
		 public String gettingAccessofPrivateMembers(){
			 return key;
		 }
	 }

}
