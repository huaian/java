package homework;
public class Sensor {
    private static int floor = 60;
    private static int upper = 90;
    public static void main(String[] args) throws InterruptedException {
        Wire wire = new Wire();
        boolean overLimit = false;
        while(true) {
            Thread.sleep(2000);
            int pressure = wire.getPressure();
            if (pressure > upper || pressure < floor) {
                System.out.println("warning! Current value: " + pressure);
                overLimit = true;
            } else {
                if (overLimit) {
                    System.out.println("warning still! Current value: " + pressure);
                } else {
                    System.out.println("ok! Current value: " + pressure);
                }
            }
        }
    }

}
