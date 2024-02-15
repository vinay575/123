package dto;

public class UserDto {

	private int userId;
	private String userName;
	private String phoneNumber;
	private String email;
	private String address;
	private String password;


	public UserDto(int userId, String userName, String phoneNumber, String email, String address, String password) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	
	
	// Constructors
	public UserDto() {
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", address=" + address + ", password=" + password + "]";
	}
	

}
