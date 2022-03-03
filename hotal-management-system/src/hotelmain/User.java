package hotelmain;


public class User {
	private String username;
	private String password;
	private String mobileNumber;
	private String eMail;
	private int gender;
	// -1 = male , 0 = female , 1 = other
	private boolean isAdmin;
	
	public User(String username , String password, String mobileNumber, String eMail , int gender,boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.eMail = eMail;
		this.isAdmin = isAdmin;
		this.gender = gender;
	}
        public User(String username , String password, String mobileNumber, String eMail , int gender) {
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.eMail = eMail;
		this.isAdmin = false;
		this.gender = gender;
	}
	
	
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public String getMobileNumber() {
		return this.mobileNumber;
	}
	public String getEMail() {
		return this.eMail;
	}
	public int getGender() {
		return this.gender;
	}
	public boolean getIsAdmin(){
            return isAdmin;
        }
	
	public String toString() {
		return this.username + ";" + this.password + ";" + this.mobileNumber + ";" + this.eMail + ";" + String.valueOf(gender) + ";" + String.valueOf(getIsAdmin()) + "\n";
	}
}
