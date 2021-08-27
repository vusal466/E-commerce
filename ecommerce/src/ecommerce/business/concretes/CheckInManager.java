package ecommerce.business.concretes;

import ecommerce.business.abstracts.CheckInServices;
import ecommerce.business.abstracts.UserCheckServices;
import ecommerce.business.abstracts.VerifyMailServices;

import ecommerce.dataAcces.abstracts.UserDao;
import ecommerce.dataAcces.concretes.HibernateUserDao;
import ecommerce.entities.concretes.User;



public class CheckInManager implements CheckInServices {
	UserDao userDao;
	VerifyMailServices verifyMail;
	UserCheckServices userCheck;
	
	
	public CheckInManager() {
		
	}
	

	
	@Override
	public void logIn(User user) {
	userCheck = new UserCheckManager();
		if(userCheck.checkMail(user) && userCheck.checkPassword(user)&& userCheck.checkSurname(user) && userCheck.checkName(user)==false) {
			System.out.println("User information entered incorrectly.");
			return;
		}
		System.out.println("logging in......");
	}

	@Override
	public void signUp(User user) {
		
		verifyMail= new VerifyMailManager();
		verifyMail.sendVerify(user);
		
		
		
		 if(verifyMail.confiramtionVerify()==false) {
			System.out.println("confirmation is denied");
			return;
		}
		userDao=new HibernateUserDao();
		userDao.add(user);
		
	}
	

}
