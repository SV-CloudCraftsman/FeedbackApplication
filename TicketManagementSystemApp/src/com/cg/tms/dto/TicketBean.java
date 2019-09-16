package com.cg.tms.dto;

public class TicketBean {
	private String ticketNo;
	private TicketCategory ticketCategory;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus;

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public TicketCategory getTicketCategory() {
		return ticketCategory;
	}

	public void setTicketCategory(TicketCategory ticketCategory) {
		this.ticketCategory = ticketCategory;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketPriority() {
		return ticketPriority;
	}

	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "TicketBean [ticketNo=" + ticketNo + ", ticketCategory=" + ticketCategory + ", ticketDescription="
				+ ticketDescription + ", ticketPriority=" + ticketPriority + ", ticketStatus=" + ticketStatus + "]";
	}

	public TicketBean(String ticketNo, TicketCategory ticketCategory, String ticketDescription, String ticketPriority,
			String ticketStatus) {
		super();
		this.ticketNo = ticketNo;
		this.ticketCategory = ticketCategory;
		this.ticketDescription = ticketDescription;
		this.ticketPriority = ticketPriority;
		this.ticketStatus = ticketStatus;
	}

}
