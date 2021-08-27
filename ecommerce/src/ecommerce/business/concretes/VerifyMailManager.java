package ecommerce.business.concretes;



import java.util.Scanner;

import ecommerce.business.abstracts.VerifyMailServices;
import ecommerce.entities.concretes.User;

public class VerifyMailManager implements VerifyMailServices {

	@Override
	public void sendVerify(User user) {
		System.out.println("Verification has send: "+ user.getName());
	
	}

	@Override
	public boolean confiramtionVerify() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose one of following:");
		System.out.println("1. Verify approval ");
		System.out.println("2. reject approval ");
		int value =sc.nextInt();
		
		if(value==1) {
			return true;
		}
			
		return false;
	}

}
