package ecommerce;




import ecommerce.business.abstracts.CheckInServices;
import ecommerce.business.concretes.CheckInManager;
import ecommerce.core.GoogleServices;
import ecommerce.core.JGoogleManagerAdapter;
import ecommerce.entities.concretes.User;
public class Main {
	

	public static void main(String[] args) {

		
		User vusal=new User();
		vusal.setName("vusal");
		vusal.setSurName("vusal");
		vusal.seteMail("vusal2001@mail.com");
		vusal.setPassword("1234556778");
		
		User vusal2 = new User();
		vusal2.setName("vusal");
		vusal2.setSurName("vusal");
		vusal2.seteMail("vusal2001mail.com");
		vusal2.setPassword("1234556778");
		
		CheckInServices checkInServices = new CheckInManager();
		
		//checkInServices.signUp(vusal);
		
		GoogleServices googleServices=new JGoogleManagerAdapter();
		
		googleServices.logIn(vusal);
		
		checkInServices.logIn(vusal2);
		
		 
	}

}
