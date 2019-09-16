package com.cg.tms.ui;

import java.util.Scanner;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;

public class MainUI {
	static TicketDAO dao=new TicketDAOImpl();
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) { 
		while(true)
		{
			System.out.println("Welcome to ITIMD Help Desk");
			System.out.println("1.Raise a Ticket");
			System.out.println("2.Exit from the system");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(((TicketDAOImpl) dao).getTicketCategoryEntries());
				
			}
			
		}
	}

}
