package logindemo.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.logindemo.UserDetails;

public class LoginDao {

	public static boolean validate(UserDetails search) {
		String userName = search.getUserName();
		String password = search.getPassword();
		System.out.println("username:" + userName + "password:" + password);
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List li = session.createQuery("from Userdetails ud").list();
		Iterator it = li.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			UserDetails ud = (UserDetails) obj;
			System.out.println("username:" + ud.getUserName());
			System.out.println("password:" + ud.getPassword());
			return true;
		}
		tx.commit();
		session.close();
		return false;
	}
}
