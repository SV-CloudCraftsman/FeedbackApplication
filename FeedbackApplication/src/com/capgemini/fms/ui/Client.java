package com.capgemini.fms.ui;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.capgemini.fms.exception.*;
import com.capgemini.fms.bean.Feedback;
import com.capgemini.fms.service.FeedbackService;
import com.capgemini.fms.service.IFeedbackService;

public class Client {
	public static void main(String[] args) {
		
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	Scanner sc=new Scanner(System.in);
	IFeedbackService service=new FeedbackService();
	String subject = null,name;//subject and name to store topic name and teacher's name
	int rating = 0;//to store feedback given by users
	int choice;
	while(true)
	{
		System.out.println("Please select from the following operations:  ");
		System.out.println("1-Add Feedback\n2-Print Feedback Report\n3-Exit");
		choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("*******ADD FEEDBACK*****");//To add Feedback details to the hashMap
			        Feedback feedbackObj=new Feedback();
			        
			        System.out.println("Enter the Teacher's name:");
			        name=sc.nextLine();
			        sc.nextLine();
			        try {
			        boolean valid=service.validateName(name);//Calling validateName() of Feedbackservice to verify the entered name
			        if(valid==true)
			        {
			        feedbackObj.setTeacherName(name);
			        System.out.println("Enter Subject Name:  ");
			        subject=sc.nextLine();
			     
			        }}catch(ExceptionClass e)
			        {
			        	System.out.println("Invalid name:  ");
			        	break;
			        }
			        try {
			        boolean validateSubject=service.validateSubject(subject);//Calling validateSubject() of Feedbackservice to verify the entered subject
			        if(validateSubject==true) {
			        feedbackObj.setTopic(subject);
//			        sc.nextInt();
			        System.out.println("Enter Rating(1-5)");
			        rating=sc.nextInt();
			        }}catch(ExceptionClass e)
			        {
			        	System.out.println("Invalid ratings:  ");
			        	break;
			        }
			        try {
			        boolean validRating=service.validateRatings(rating);//Calling validateRatings() of Feedbackservice to verify the entered ratings
			        if(validRating==true)
			        {
			        feedbackObj.setRating(rating);
			        map=(HashMap<String, Integer>) service.addFeedbackDetails(feedbackObj.getTeacherName(),feedbackObj.getRating(),feedbackObj.getTopic());
			        }
			        }
			        catch(ExceptionClass e)
			        	{
			        	System.out.println("Could not add details");
			        	}

			        break;
			        
			        case 2: System.out.println("********PRINT FEEDBACK*******");//This is for obtaining the entered report 
			        map=(HashMap<String, Integer>) service.getFeedbackReport();
			        Set<Entry<String, Integer>> set1=map.entrySet();	//converting HashMap to set
					
					Iterator<Entry<String, Integer>> itr=set1.iterator();    //creating object of iterator
					
					while(itr.hasNext())
					{
						Map.Entry<String, Integer> entry=(Map.Entry<String, Integer>) itr.next();  //selecting key and corresponding value attribute and storing in variable entry.
						System.out.println("Teacher's name: "+entry.getKey());
						System.out.println("Rating:  "+entry.getValue());
						
					}
					break;
					
			        case 3:System.exit(0);
			        break;
			}
		}
		}
	}
	