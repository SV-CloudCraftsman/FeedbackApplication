package com.capgemini.fms.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.capgemini.fms.dao.FeedbackDAO;
import com.capgemini.fms.dao.IFeedbackDAO;
import com.capgemini.fms.exception.ExceptionClass;

public class FeedbackService implements IFeedbackService {
	
	IFeedbackDAO dao=new FeedbackDAO();

	//method to validate teacher's name
	@Override
	public boolean validateName (String name) throws ExceptionClass {
		boolean b=false;
		try {
		if ( Pattern.matches("([A-Z])*([a-z]*)",name))
		{
			 b=true;
			 }
		else {
			throw new ExceptionClass();}}
		catch(ExceptionClass e){
			throw new ExceptionClass();	
		}
		return b;
}
	//method to validate subject name as subject can only be Math or English
	@Override
	public boolean validateSubject(String subject) throws ExceptionClass
	{
		String s2="English";
		String s3="Math";
		boolean a=false;
		try {
			if(subject==s2 || subject==s3)
				a=true;
			else
				throw new ExceptionClass();
		}catch(ExceptionClass e)
		{
			throw new ExceptionClass();
		}
		
		return a;
		
	}
	
	//method to validate ratings
	@Override
	public boolean validateRatings(int rating) throws ExceptionClass {
		boolean res=false;
		try {
			if(rating>=1 && rating<=5)
				res=true;
			else
				throw new ExceptionClass();
		}catch(ExceptionClass e)
		{
			throw new ExceptionClass();
		}
		return res;
	}
	
	//method to add details of teachers including rating given to them
	@Override
	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject) throws ExceptionClass {
	
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		try {
		map=dao.addFeedbackDetails(name,rating,subject);
		}catch(ExceptionClass e)
		{
			throw new ExceptionClass();
		}
		return map;
	}
	
	//method to obtain feedback report
	@Override
	public Map<String, Integer> getFeedbackReport() {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		try {
		map=dao.getFeedbackReport();
		}catch(ExceptionClass e)
		{
			try {
				throw new ExceptionClass();
			} catch (ExceptionClass e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return map;
	}
	
	
}