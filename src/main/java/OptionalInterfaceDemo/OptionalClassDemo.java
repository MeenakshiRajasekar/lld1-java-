package OptionalInterfaceDemo;

import java.util.Optional;

public class OptionalClassDemo {
	
	public static void main(String[] args) {
		String searchUserName = "Meenakhsi";
		Optional<User> user1 = UserRepository.getUserbyUserName(searchUserName);
		User defaultUser = new User("default", "default@gmail.com");
		User resultUser = user1.orElse(defaultUser);
		System.out.println(resultUser);
	}

}
