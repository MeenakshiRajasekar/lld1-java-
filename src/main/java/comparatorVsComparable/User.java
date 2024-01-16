package comparatorVsComparable;

public  class User implements Comparable<User> {
	
	String userName;
	int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserImplementsComparable [userName=" + userName + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public User(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}
	

}
