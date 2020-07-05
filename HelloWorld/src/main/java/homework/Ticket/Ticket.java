package homework.Ticket;

public class Ticket {
    private TicketGenerator.CustomerType customerType;
    private int ticketNumber;
    public Ticket(int ticketNumber, TicketGenerator.CustomerType customerType) {
        this.ticketNumber = ticketNumber;
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "customerType=" + customerType +
                ", ticketNumber=" + ticketNumber +
                '}';
    }
}
