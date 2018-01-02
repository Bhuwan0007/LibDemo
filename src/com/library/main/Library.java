package com.library.main;

import java.util.Scanner;

import com.library.login.AdminLogin;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any User to Login :");
		System.out.println("\n1. Admin Login \n2. Librarian Login");
		int login = sc.nextInt();
		do{
			if(login == 1){
				System.out.println("Admin Login ...");
				AdminLogin.getAdminLogin();
			}else if(login == 2){
				System.out.println("Librarian Login");
			}
			
		}while(login>1);

	}

}
