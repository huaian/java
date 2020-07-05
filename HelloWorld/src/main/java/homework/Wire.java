package homework;

import java.util.Random;
public class Wire {
    private int times = 0;
    public int getPressure() {
        times++;
//        if (times < 5) {
//            // overlimit values
//           return (new Random().nextInt(9) + 91);
//        } else {
//            // normal values
//            return (new Random().nextInt(30)) + 60;
//        }
//        return (new Random().nextInt(30)) + 60;
        return (new Random().nextInt(60)) + 0;
    }
}
