package examples.finaltask.helpdesk.facades.impl;

import java.util.PriorityQueue;
import java.util.Queue;

import examples.finaltask.helpdesk.enteties.SupportTicket;
import examples.finaltask.helpdesk.facades.HelpDeskFacade;
import examples.finaltask.helpdesk.utils.CustomSupportTicketsComparator;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	
	private Queue<SupportTicket> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		tickets.offer(supportTicket);
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return tickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return tickets.size();
	}

}
