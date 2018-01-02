package com.library.login;

import java.util.Scanner;

public class AdminLogin {

	public static void getAdminLogin(){
		System.out.println("Please provide Admin credentials....");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Admin name : ");
		String userName = sc.next();
		System.out.print("Enter password : ");
		String password = sc.next();
		
		if(userName.equalsIgnoreCase("asd") && password.equalsIgnoreCase("asd")){
			System.out.println("Admin Login Successfully");
			AdminSuccess.getAdminSuccess();
		}else{
			System.out.println("Enter valid credentails...");
			System.out.println("Do you want to continue?");
			System.out.println("Press 1 for continnue");
			
			Scanner sc1 = new Scanner(System.in);
			int b = sc1.nextInt();			
			do{
				if(b==1){
					getAdminLogin();
				}
			}while(b==1);
		}
	}

	


}
