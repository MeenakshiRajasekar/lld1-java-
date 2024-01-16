package OptionalInterfaceDemo;

import java.util.Optional;

public class UserRepository {
	
	public static final User user1 = new User("Meenakshi", "meenakshi@gmail.com");
	public static final User user2 = new User("Abi", "abinaya@gmail.com");
	public static final User user3 = new User("Ajith", "ajith@gmail.com");
	
	static Optional<User> getUserbyUserName(String userName){
		if(userName.equals("Meenakhsi")) {
			return Optional.of(user1);
		}
		else if(userName.equals("Abi")) return Optional.of(user2);
		else return Optional.of(user3);
	}

}
