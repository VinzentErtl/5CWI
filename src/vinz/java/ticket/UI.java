package vinz.java.ticket;

public class UI {
    private Controller controller = new Controller();

    public void buttonPressed() {
        Ticket ticket = controller.createTicket();
        displayText(ticket.toString());

    }


    public void displayText(String text) {
        System.out.println("display: " + text);
    }
}
