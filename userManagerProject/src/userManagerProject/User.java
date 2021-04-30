package userManagerProject;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private String email;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String nationalIdentity, String email) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataId() {
		String mail = email.toUpperCase();
		return id*2*7+mail.substring(1,3)+nationalIdentity.substring(1,4)+" DataId";
	}
}
