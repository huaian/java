package homework;

import java.util.ArrayList;

public class Clock extends AbstractClock {
    private int offset = 0;
    private ArrayList<Clock> slaveClockList = new ArrayList<Clock>();
    private int time = 0;

    public int getTime() {
        return time;
    }

    public Clock(int i) {
        this.offset = i;
    }

    public void addSlaveClocks(ArrayList<Clock> slaveClockList) {
        this.slaveClockList = slaveClockList;
    }

    public ArrayList<Clock> getSlaveClockList() {
        return slaveClockList;
    }

    public void setTime() {
        this.time = standardTime + this.offset;
    }

    public void setTime(int i) {
        this.time = i;
        int calculatedStandardTime = this.time - this.offset;
        int standardTime = (calculatedStandardTime <0 || calculatedStandardTime > 23) ? (calculatedStandardTime + 24) % 24: calculatedStandardTime;
        this.setStandardTime(standardTime);
        this.slaveClockList.forEach((clock) -> {
            clock.setTime();
        });
    }
}
