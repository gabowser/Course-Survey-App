package model;
/**
 * Class that represents an Admin level user. AdminAccounts are associated with a Institution and can
 * generate new UserAccounts within that Institution.
 * 
 * @author Tyler Younkins, Garlan Bowser, Cory Dawson
 *
 */
public class AdminAccount {
 

	
	private String name, password;
	
	/**
	 * Constructor 
	 * @param name - new Admin account name
	 * @param password - new Admin account password
	 */
	public AdminAccount (String accountName, String password) {
		this.name = accountName;
		this.password = password;
	}
	
	/**
	 * Get the Admin account's name
	 * @return name
	 */
	
	public String getName () {
		return name;
	}
	/**
	 * Set the Admin account's name.
	 * @param name
	 */
	
	public void setName (String name) {
		this.name = name;
	}
	/**
	 * Set the Admin account's password
	 * @param password
	 */
	public void setPassword (String password ) {
		this.password = password;
	}
	
	/**
	 * Get the Admin account's password
	 * @return password 
	 */
	public String getPassword () {
		return password;
	}
	
	
}
