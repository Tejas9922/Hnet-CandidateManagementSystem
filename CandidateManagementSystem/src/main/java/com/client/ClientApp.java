package com.client;

import java.io.Serializable;
import java.util.Scanner;

import com.controller.Controller;
import com.entity.Candidate;

public class ClientApp {

	public static void main(String[] args) {
		Controller conn=new Controller();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Get candidate");
			System.out.println("Exit");
			System.out.println("Enter your choice:-");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Getting candidate");
				Candidate object=conn.getCandidate();
				System.out.println(object);
				
				break;
				
			case 2:
				System.out.println("Getting candidate");
				Serializable s=conn.insertCandidate();
				System.out.println(s);
				
				break;
				
			case 3:
				System.out.println("Getting candidate");
				boolean b=conn.updateCandidate();
				System.out.println(b);
				
				break;
				
			case 4:
				System.out.println("Getting candidate");
				boolean c=conn.saveOrUpdateCandidate();
				System.out.println(c);
				
				break;
			case 5:
				System.out.println("Getting candidate");
				boolean d=conn.deleteCandidate();
				System.out.println(d);
				
				break;
				
			case 6:
				System.out.println("Exiting.........");
				sc.close();
				return;
			}
		}
		

	}

}
