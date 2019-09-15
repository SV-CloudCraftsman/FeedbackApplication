package com.capgemini.fms.dao;

import java.util.HashMap;

import com.capgemini.fms.exception.ExceptionClass;

public interface IFeedbackDAO {

	
	
	public HashMap<String,Integer> getFeedbackReport() throws ExceptionClass;

	public HashMap<String, Integer> addFeedbackDetails(String name, int rating, String subject) throws ExceptionClass;

}
