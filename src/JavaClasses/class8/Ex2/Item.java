package JavaClasses.class8.Ex2;

public class Item {
    protected String title;
    protected int playingTime;

    public Item() {}

    public Item(String title, int playingTime) {
        this.title = title;
        this.playingTime = playingTime;
        System.out.println("Item");
    }

    public String toString() {
        return String.format("Title: %s%nPlaying Time: %d%n", title, playingTime);
    }

}
