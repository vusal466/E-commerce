package ecommerce.business.abstracts;

import ecommerce.entities.concretes.User;

public interface UserCheckServices {

	boolean checkName(User user);
	boolean checkSurname(User user);
	boolean checkMail(User user);
	boolean checkPassword(User user);
	
}
