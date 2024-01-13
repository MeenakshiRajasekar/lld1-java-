package typesOfNestedClassWithAnonymousClass;

public class ClassWithAnonymousInner {

	public static void main(String[] args) {
		ClassWithAnonymousInner obj = new ClassWithAnonymousInner();
		Parrot p = new Parrot() {

			@Override
			void fly() {
				System.out.println("parrots can fly");
				
			}
			
		};
		p.fly();
	}
}
