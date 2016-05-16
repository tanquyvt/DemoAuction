package entity;

public class Account {

	private int accountID;
	private String accountName;
	private String password;

	public Account() {

	}

	public Account(String name, String pwd) {
		this.accountName = name;
		this.password = pwd;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
