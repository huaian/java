package homework.Ticket;

public class IdGenerator {
    private int currentTicketNumber;
    private int baseNormalTicketNumber = 1001;
    private int baseVipTicketNumber = 2001;
    private int normalTicketNumber = baseNormalTicketNumber;
    private int vipTicketNumber = baseVipTicketNumber;
    public int getTicketNumber(TicketGenerator.CustomerType customerType) throws Exception {
        if (customerType == TicketGenerator.CustomerType.VIP) {
            return ++vipTicketNumber;
        } else if (customerType == TicketGenerator.CustomerType.NORMAL) {
            normalTicketNumber += 1;
            if (normalTicketNumber >= baseVipTicketNumber) {
                normalTicketNumber = normalTicketNumber % 2001  + 1001;
            }
            return normalTicketNumber;
        } else {
            throw new Exception("unknown customerType");
        }
    }
}
