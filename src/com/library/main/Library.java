package com.library.main;

import java.util.Scanner;

import com.library.login.AdminLogin;
import com.library.login.LibrarianLogin;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any User to Login :");
		System.out.println("\n 1. Admin Login \n 2. Librarian Login");
		int login = sc.nextInt();
		
		if(login == 1){
			System.out.println("Admin Login Successfully...");
			AdminLogin.getAdminLogin();
		}else if(login == 2){
			System.out.println("Librarian Login");
			LibrarianLogin.getLibrarianLogin();
		}

	}

}
