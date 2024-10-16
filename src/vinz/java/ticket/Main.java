package vinz.java.ticket;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();


        Ticket ticket = controller.createTicket();
        System.out.println(ticket);
    }

    
}
