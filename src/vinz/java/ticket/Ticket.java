package vinz.java.ticket;

import java.util.Random;

public class Ticket {
    private int id;
    private long createTimestamp;
    private long payedTimestamp;
    private boolean isPayed = false;
    private Random random = new Random();

    public Ticket(int id, long createTime, long payedTime) {
        this.id = random.nextInt();
        this.createTimestamp = System.currentTimeMillis();
        this.payedTimestamp = -1;
    }

    public Ticket() {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public long getPayedTimestamp() {
        return payedTimestamp;
    }

   public void setPayedTimestamp(long payedTimestamp) {
       this.payedTimestamp = payedTimestamp;
       this.isPayed = true;
   }

   @Override
   public String toString() {
    return "ID:" + id + " PayedTimestamp:" + payedTimestamp + " CreatedTimestamp:" + createTimestamp;
   }

    
}
