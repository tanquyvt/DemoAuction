package dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import entity.Account;

public class AccountDaoImpl implements AccountDao {

	private static SessionFactory factory;

	public AccountDaoImpl() {
		try {
			factory = new Configuration().configure("hibernate/hibernate.cfg.xml").addResource("hibernate/Account.hbm.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	@Override
	public int addAccount(Account acc) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer userID = null;
		try {
			tx = session.beginTransaction();
			userID = (Integer) session.save(acc);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {

			session.close();
		}

		return userID;
	}

	@Override
	public void update(Account acc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Account acc) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account findAccountByName(String accName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Account.class);
		Transaction tx = null;
		Account account = new Account();
		try {
			tx = session.beginTransaction();
			account = (Account) criteria.add(Restrictions.eq("accountName", accName)).uniqueResult();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {

			session.close();
		}

		return account;
	}

	@Override
	public void listUsers() {
		// TODO Auto-generated method stub

	}

}
