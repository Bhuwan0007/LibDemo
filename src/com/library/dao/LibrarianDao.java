package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.library.db.LibraryDatabase;
import com.library.dto.Admin;
import com.library.login.AdminSuccess;

public class LibrarianDao{

	public static void addLibrarian() {
		// TODO Auto-generated method stub

		System.out.println("\n Please provide Librarian Details :");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter Name : ");
		String librarianName = sc.nextLine();
		
		System.out.println("\n Enter Password : ");
		String librarianPassword = sc.nextLine();
		
		System.out.println("\n Enter Email : ");
		String librarianEmail = sc.nextLine();
		
		System.out.println("\n Enter Address : ");
		String librarianAddress = sc.nextLine();
		
		System.out.println("\n Enter City : ");
		String librarianCity = sc.nextLine();
		
		System.out.println("\n Enter Contact No : ");
		String librarianContact = sc.nextLine();
		
		int i = save(librarianName,librarianPassword,librarianEmail,librarianAddress,librarianCity,librarianContact);
		
		if(i>0){
			System.out.println("\n **** Librarian added successfully **** ");
			AdminSuccess.getAdminSuccess();
		}
		
	}

	public static void viewLibrarian() {
		// TODO Auto-generated method stub
		try{
			Connection con=LibraryDatabase.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("\n Id : "+rs.getString(1)+"\n Name : "+rs.getString(2)+"\n Password : "+rs.getString(3)+"\n Email : "+rs.getString(4)+"\n Address : "+rs.getString(5)+"\n City : "+rs.getString(6)+"\n Contact : "+rs.getString(7));  							
			}
			AdminSuccess.getAdminSuccess();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void deleteLibrarian() {
		// TODO Auto-generated method stub
		System.out.println("\n Enter Id : ");
		Scanner sc = new Scanner(System.in);
		int librarianId = sc.nextInt();
		int i = 0;
		
		if(librarianId < 1){
			System.out.println("Id can't be blank or negative ");
		}else{
			i = delete(librarianId);
		}
		
		if(i>0){
			System.out.println(" **** Librarian deleted successfully **** ");
			AdminSuccess.getAdminSuccess();
		}else{
			System.out.println("Unable to delete given id : "+librarianId);
			System.out.println("\nPlease try once again");
			AdminSuccess.getAdminSuccess();
		}
	}

	public static int save(String librarianName,String librarianPassword,String librarianEmail,String librarianAddress,String librarianCity,String librarianContact){
		int status = 0;
		try{
			Connection con = LibraryDatabase.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into librarian(name,password,email,address,city,contact) values(?,?,?,?,?,?)");
			ps.setString(1, librarianName);
			ps.setString(2, librarianPassword);
			ps.setString(3, librarianEmail);
			ps.setString(4, librarianAddress);
			ps.setString(5, librarianCity);
			ps.setString(6, librarianContact);
			
			status = ps.executeUpdate();
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}		
		return status;		
	}
	
	public static int delete(int id){
		int status = 0;
		try{
			Connection con = LibraryDatabase.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from librarian where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}	
		return status;
	}	
	
	public static boolean validate(String userName, String password){
		boolean status = false; 
		try{
			Connection con = LibraryDatabase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from librarian where name=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);
			
			ResultSet rs =  ps.executeQuery();
			status = rs.next();
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		return status;		
	}
	
}
