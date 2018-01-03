package com.library.login;

import java.util.Scanner;

import com.library.dao.LibrarianDao;
import com.library.main.Library;

public class AdminSuccess {

	public static void getAdminSuccess(){
		System.out.println("\n Admin Login ...");
		System.out.println("\n 1. Add Librarian \n 2. View Librarian \n 3. Delete Librarian \n 4. Logout");
		System.out.println("\n Enter your choice");
		Scanner sc = new Scanner(System.in);
		int adminSuccess = sc.nextInt();
		
		if(adminSuccess==1){
			System.out.println("\n Adding Librarian ");
			LibrarianDao.addLibrarian();
		}else if(adminSuccess==2){
			System.out.println("\n View Librarian");
			LibrarianDao.viewLibrarian();
		}else if(adminSuccess==3){
			System.out.println("\n Deleting Librarian");
			LibrarianDao.deleteLibrarian();
		}else{
			System.out.println("Logout");
			Library.main(new String[]{});
		}
	}
}
