package ecommerce.dataAcces.concretes;

import java.util.*;

import ecommerce.dataAcces.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public class HibernateUserDao  implements UserDao{
	
	ArrayList<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {
		if(users.contains(user)) {
			System.out.println("User already exists.");
			return;
		}
		users.add(user);
		System.out.println("verification code sent.");
	}

	@Override
	public void delete(User user) {
		users.remove(users.indexOf(user));
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	

}
