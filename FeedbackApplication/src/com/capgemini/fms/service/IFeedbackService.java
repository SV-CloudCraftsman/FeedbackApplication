package com.capgemini.fms.service;

import java.util.Map;

import com.capgemini.fms.exception.ExceptionClass;

public interface IFeedbackService {

	//interface IFeedbackService is implemented by FeedbackService and the following methods are defined in FeedbackService
	public boolean validateName (String name) throws ExceptionClass;
	
	public boolean validateSubject(String subject) throws ExceptionClass;
	
	public boolean validateRatings(int rating) throws ExceptionClass;
	
	public Map<String,Integer> addFeedbackDetails(String name,int rating,String subject) throws ExceptionClass;
	
	public Map<String,Integer> getFeedbackReport();
}
