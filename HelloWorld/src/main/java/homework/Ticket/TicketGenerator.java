package homework.Ticket;



public class TicketGenerator {
    enum CustomerType {
        VIP,
        NORMAL
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
        IdGenerator generator = new IdGenerator();
        int ticketNumber = 0;
        try {
            ticketNumber = generator.getTicketNumber(CustomerType.NORMAL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Ticket normalTicket = new Ticket(ticketNumber, CustomerType.NORMAL);
        System.out.println(normalTicket);

        try {
            int vipTicketNumber = generator.getTicketNumber(CustomerType.VIP);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Ticket vipTicket = new Ticket(ticketNumber, CustomerType.VIP);
        System.out.println(vipTicket);

    }
}
