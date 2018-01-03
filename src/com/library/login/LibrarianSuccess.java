package com.library.login;

import java.util.Scanner;

public class LibrarianSuccess {
	public static void getLibrarianSuccess(){
		System.out.println("\n Librarian Login ...");
		System.out.println("\n 1. Add Books \n 2. View Books \n 3. Issue Books \n 4. View Issued Books \n 5. Return Books \n 6. Logout");
		System.out.println("\n Enter your choice");
		Scanner sc = new Scanner(System.in);
		int librarianSuccess = sc.nextInt();
	}

}
