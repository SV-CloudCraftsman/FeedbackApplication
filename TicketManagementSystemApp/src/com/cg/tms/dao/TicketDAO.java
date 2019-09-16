package com.cg.tms.dao;

import java.util.List;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public interface TicketDAO {
	public int raiseNewTicket(TicketBean ticketBean);
	public List<TicketCategory>listTicketCategory();

}
