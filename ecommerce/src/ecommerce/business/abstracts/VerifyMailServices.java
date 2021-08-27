package ecommerce.business.abstracts;

import ecommerce.entities.concretes.User;

public interface VerifyMailServices {

	void sendVerify(User user);
	boolean confiramtionVerify();
}
