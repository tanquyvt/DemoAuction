package dao;

import entity.Account;

public class TestDao {

	public static void main(String[] args) {

		AccountDao dao = new AccountDaoImpl();

		Account u1 = new Account("u10", "10");
		Account u2 = new Account("u20", "20");
		Account u3 = new Account("u30", "30");

		Account user = new Account();

//		int uID1 = dao.addAccount(u1);
//		int uID2 = dao.addAccount(u2);
//		int uID3 = dao.addAccount(u3);

		user = dao.findAccountByName("u10");

//		System.out.println("Account ids: " + uID1 + ", " + uID2 + ", " + uID3);
		System.out.println("Found userID: " + user.getAccountID());

	}

}
