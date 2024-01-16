package comparatorVsComparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
public static void main(String[] args) {
	List<User> userList = new ArrayList<>();
	userList.add(new User("Meenakshi",100));
	userList.add(new User ("Kabilan", 212));
	userList.add(new User("Million", 30));
	userList.add(new User ("Almond", 30) );
	
	Comparator<User> com = new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return Integer.compare(o1.age, o2.age);
		}
		
	};
	Collections.sort(userList, com);
	for(User us : userList)
		System.out.println(us);
	
}

}
