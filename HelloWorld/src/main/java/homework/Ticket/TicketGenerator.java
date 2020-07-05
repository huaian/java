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
        for (int i = 0; i <= 1000; i++) {
            int normalTicketNumber = 0;
            try {
                normalTicketNumber = generator.getTicketNumber(CustomerType.NORMAL);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Ticket normalTicket = new Ticket(normalTicketNumber, CustomerType.NORMAL);
            System.out.println(normalTicket);

            int vipTicketNumber = 0;
            try {
                vipTicketNumber = generator.getTicketNumber(CustomerType.VIP);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Ticket vipTicket = new Ticket(vipTicketNumber, CustomerType.VIP);
            System.out.println(vipTicket);
        }
    }
}
