package homework;

import java.text.CollationKey;
import java.util.ArrayList;

public abstract class AbstractClock {
    protected static int standardTime = 0;
    public abstract void addSlaveClocks(ArrayList<Clock> slaveClockList);
    public abstract void setTime(int i);
    public void setStandardTime(int i) {
        this.standardTime = i;
    }
    protected abstract void setTime();
}
