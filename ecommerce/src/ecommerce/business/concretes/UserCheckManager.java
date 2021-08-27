package ecommerce.business.concretes;

import java.util.regex.Pattern;

import ecommerce.business.abstracts.UserCheckServices;
import ecommerce.entities.concretes.User;

public class UserCheckManager implements UserCheckServices{

	@Override
	public boolean checkName(User user) {
		if(user.getName().isEmpty()) {
			System.out.println("This field cannot be left blank.");
			return false;
		}else if(user.getName().length()<2) {
			System.out.println("Name must be at least 2 character.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkSurname(User user) {
		if(user.getSurName().isEmpty()) {
			System.out.println("This field cannot be left blank.");
			return false;
		}else if(user.getSurName().length()<2) {
			System.out.println("Surname must be at least 2 character.");
			return false;
		}
		return false;
	}

	@Override
	public boolean checkMail(User user) {
		if(validEmail(user.geteMail())==false) {
			System.out.println("E-mail must be e-mail format.");
			return false;
		}else if(user.geteMail().isEmpty()) {
			System.out.println("This field cannot be left blank.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("This field cannot be left blank.");
		}else if(user.getPassword().length()<6) {
			System.out.println("password must be at least 6 character.");
		}
		return true;
	}
	
	//for email checking
	public boolean validEmail(String email) {
		
		Pattern regex = Pattern.compile("^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+@[A-Z0-9.-]+.(com|org|ru|gov)(.[A-Z]{2,})?$",
				Pattern.CASE_INSENSITIVE);
		
		return regex.matcher(email).find();
	}
	

}
