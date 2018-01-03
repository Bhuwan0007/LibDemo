package com.library.login;

import java.util.Scanner;

import com.library.dao.LibrarianDao;

public class LibrarianLogin {
	public static void getLibrarianLogin(){
		System.out.println("\n Please provide Librarian credentials....");
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Librarian name : ");
		String userName = sc.next();
		System.out.print("\n Enter Librarian password : ");
		String password = sc.next();
		
		if(LibrarianDao.validate(userName,password)){
			System.out.println("\n **** Librarian Login Successfully **** ");
			LibrarianSuccess.getLibrarianSuccess();
		}else{
			System.out.println("Sorry, Username : "+userName+" or Password : "+password+" Error ");
			System.out.println("Do you want to continue?");
			System.out.println("Press 1 to continnue");
			
			Scanner sc1 = new Scanner(System.in);
			int b = sc1.nextInt();			
			
			if(b==1){
				getLibrarianLogin();
			}
		}
	}

}
