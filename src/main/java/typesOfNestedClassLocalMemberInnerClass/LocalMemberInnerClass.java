package typesOfNestedClassLocalMemberInnerClass;

public class LocalMemberInnerClass {

	public  void methodHasClass() {
		class InnerClassOfMethod{
			void print() {
				System.out.println("I am restricting the access of private members with me ");
			}
		}
		
		InnerClassOfMethod obj = new InnerClassOfMethod();
		obj.print();
	}
	public static void main(String[] args) {
		LocalMemberInnerClass outerObj = new LocalMemberInnerClass();
		outerObj.methodHasClass();
	}

	//it provides security of method properties
}
