package vinz.java.ticket;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Printer printer = new Printer();
    private List<Ticket> tickets = new ArrayList<Ticket>();


    public Ticket createTicket(){
        Ticket ticket = new Ticket();
        printer.printTicket(ticket);
        tickets.add(ticket);
        return ticket;

    }

    

}
