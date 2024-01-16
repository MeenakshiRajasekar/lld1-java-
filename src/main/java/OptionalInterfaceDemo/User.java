package OptionalInterfaceDemo;

public class User {
	String userName;
	String mailId;
	
	public User(String userName, String mailId) {
		super();
		this.userName = userName;
		this.mailId = mailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", mailId=" + mailId + "]";
	}
	
	

}
