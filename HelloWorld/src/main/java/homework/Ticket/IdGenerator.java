package homework.Ticket;

public class IdGenerator {
    private int currentTicketNumber;
    private int baseVipTicketNumber = 2001;
    private int baseNormalTicketNumber = 1001;
    public int getTicketNumber(TicketGenerator.CustomerType customerType) throws Exception {
        if (customerType == TicketGenerator.CustomerType.VIP) {
            int vipTicketNumber = baseNormalTicketNumber + 1;
            return vipTicketNumber;
        } else if (customerType == TicketGenerator.CustomerType.NORMAL) {
            int normalTicketNumber = baseNormalTicketNumber + 1;
            if (normalTicketNumber >= baseVipTicketNumber) {
            }
            return normalTicketNumber;
        } else {
            throw new Exception("unknown customerType");
        }
    }
}
