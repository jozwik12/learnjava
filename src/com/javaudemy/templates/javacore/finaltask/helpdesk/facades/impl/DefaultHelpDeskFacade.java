package com.itbulls.learnit.javacore.finaltask.helpdesk.facades.impl;

import com.itbulls.learnit.javacore.finaltask.helpdesk.enteties.SupportTicket;
import com.itbulls.learnit.javacore.finaltask.helpdesk.facades.HelpDeskFacade;
import com.itbulls.learnit.javacore.finaltask.helpdesk.utils.CustomSupportTicketsComparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {

    private final Queue<SupportTicket> tickets;

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
