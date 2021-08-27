package ecommerce.core;

import ecommerce.entities.concretes.User;
import ecommerce.jgooglecheckin.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleServices {

	@Override
	public void logIn(User user) {
		JGoogleManager googleMan = new JGoogleManager();
		googleMan.login(user.geteMail(), user.getPassword());
	}
	

}
