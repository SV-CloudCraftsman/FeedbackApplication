package com.cg.tms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class TicketDAOImpl implements TicketDAO {
	
	private static Map<String,String> ticketCategory=new HashMap<String,String>();
	public static Map<String,String> getTicketCategoryEntries()
	{
		ticketCategory.put("tc001", "software installation");
		ticketCategory.put("tc002", "mailbox creation");
		ticketCategory.put("tc003", "mailbox issues");
		return ticketCategory;
		
	}

	@Override
	public int raiseNewTicket(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
