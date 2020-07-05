package homework;

public class Player {
    private final String name;
    public boolean isInPrison;
    public int prize;
    public Player(String name) {
       this.name = name;
       this.prize = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "isInPrison=" + isInPrison +
                ", prize=" + prize +
                ", name=" + name +
                '}';
    }
}
