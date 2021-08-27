package ecommerce.business.abstracts;

import ecommerce.entities.concretes.User;

public interface CheckInServices {

	void logIn(User user);
	void signUp(User user);
}
