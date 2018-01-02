package com.library.login;

import java.util.Scanner;

import com.library.main.Library;

public class AdminSuccess {

	public static void getAdminSuccess(){
		System.out.println("\n Admin Login ...");
		System.out.println("\nAdd Librarian \n2. View Librarian \n 3. Delete Librarian \n 4. Logout");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int adminSuccess = sc.nextInt();
		
		if(adminSuccess==1){
			System.out.println("Adding Librarian ");
		}else if(adminSuccess==2){
			System.out.println("Deleting Librarian");
		}else if(adminSuccess==3){
			System.out.println("Deleting Librarian");
		}else{
			Library.main(new String[]{});
		}
	}
}
