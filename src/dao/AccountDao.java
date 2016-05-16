package dao;

import entity.Account;

public interface AccountDao {

	public int addAccount(Account acc);

	public void listUsers();

	public void update(Account acc);

	public void delete(Account acc);

	public Account findAccountByName(String accName);

}
