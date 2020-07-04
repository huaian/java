package homework;

import java.util.ArrayList;
import java.util.Collection;

class TimeSyncer {
    private Clock masterClock = new Clock(0);
    private ArrayList slaveClockList = new ArrayList<Clock>();
    TimeSyncer (Clock masterClock, ArrayList<Clock> slaveClockList) {
        this.masterClock = masterClock;
        this.slaveClockList = slaveClockList;
        this.masterClock.addSlaveClocks(slaveClockList);
    }
    public Clock getMasterClock() {
        return masterClock;
    }
}

public class ClockSync {
    public static void main(String args[]) {
        Clock masterClock = new Clock(8);
        Clock salveClockOne = new Clock(4);
        Clock slaveClockTwo = new Clock(-4);
        ArrayList<Clock> slaveClockList = new ArrayList<Clock>();
        slaveClockList.add(salveClockOne);
        slaveClockList.add(slaveClockTwo);
        TimeSyncer timeSyncer = new TimeSyncer(masterClock, slaveClockList);
        timeSyncer.getMasterClock().setTime(8);
        for (Clock clock : timeSyncer.getMasterClock().getSlaveClockList()) {
            System.out.println(clock.getTime());
        }
    }
}

