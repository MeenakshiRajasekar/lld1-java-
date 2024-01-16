package comparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparatorVsComparable.User;

public class ComparableDemo {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Meenakshi",100));
		userList.add(new User ("Kabilan", 212));
		userList.add(new User("Million", 30));
		userList.add(new User ("Almond", 30) );
		
		Collections.sort(userList);
		userList.forEach(System.out::println);
		
	}

}
