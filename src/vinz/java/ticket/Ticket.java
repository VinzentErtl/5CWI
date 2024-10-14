package vinz.java.ticket;

public class Ticket {
    private int id;
    private long createTime;
    private long payedTime;

    public Ticket(int id, long createTime, long payedTime) {
        this.id = id;
        this.createTime = createTime;
        this.payedTime = payedTime;
    }

    public int getId() {
        return id;
    }

    public void printID(int id) {
        System.out.println("Ticket ID =" + id);
    }

    
}
