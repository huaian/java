package homework;

public class Question {
    String content;
    Game.Category category;
    public Question(String content, Game.Category category) {
        this.content = content;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Question{" +
                "content='" + content + '\'' +
                ", category=" + category +
                '}';
    }
}
