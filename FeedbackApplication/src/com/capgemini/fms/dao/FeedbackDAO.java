package com.capgemini.fms.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.capgemini.fms.exception.ExceptionClass;



public class FeedbackDAO implements IFeedbackDAO{

	
	HashMap<String,Integer> EnglishFeedbackMap=new HashMap<String,Integer>();
	HashMap<String,Integer> MathFeedbackMap=new HashMap<String,Integer>();
	HashMap<String,Integer> FeedbackMap=new HashMap<String,Integer>();

	
	@Override
		public HashMap<String, Integer> addFeedbackDetails(String name, int rating, String subject) throws ExceptionClass
		{
			String s1="English";
		String s2="Math";
		try {
		
		if(s1==subject)
		{
			EnglishFeedbackMap.put(name, rating);
			FeedbackMap.put(name, rating);
		}
		else if(s2==subject)
		{
			MathFeedbackMap.put(name, rating);
			FeedbackMap.put(name, rating);
		}
		
		else {
			subject=null;
			throw new ExceptionClass();
		}}
		catch(ExceptionClass e)
		{
			throw new ExceptionClass();
		}
		return FeedbackMap;
		}


	@Override
	public HashMap<String, Integer> getFeedbackReport() throws ExceptionClass  {
		
		Set<Entry<String, Integer>> set1=EnglishFeedbackMap.entrySet();	//converting HashMap to set
		Set<Entry<String, Integer>> set2=MathFeedbackMap.entrySet();
		Iterator<Entry<String, Integer>> itr=set1.iterator();    //creating object of iterator
		Iterator<Entry<String, Integer>> itr2=set2.iterator();
		while(itr.hasNext())
		{
			while(itr2.hasNext()) {
			Map.Entry<String, Integer> entry=(Map.Entry<String, Integer>) itr.next();  //selecting key and corresponding value attribute and storing in variable entry.
			Map.Entry<String, Integer> entry2=(Map.Entry<String, Integer>) itr2.next();
			if(entry.getKey().equals(entry2.getKey()))						//check if the selected key value matches with provided account number
			{
				int rate=entry.getValue();
				int rate2=entry2.getValue();
				if(rate>rate2)
				{
					FeedbackMap.put(entry.getKey(),entry.getValue());
					EnglishFeedbackMap.remove(entry.getKey(), entry.getValue());
				}
				else {
					FeedbackMap.put(entry2.getKey(),entry2.getValue());
					MathFeedbackMap.remove(entry.getKey(), entry.getValue());

			}
			}
		FeedbackMap.putAll(EnglishFeedbackMap);;
		FeedbackMap.putAll(MathFeedbackMap);
		return FeedbackMap;
	}
	
	
		}
		return EnglishFeedbackMap;
}


}