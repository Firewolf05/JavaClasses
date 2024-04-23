package JavaClasses.class8.Ex2;

public class DVD extends Item {
    private String director;
    private int numTrucks;

    public DVD(String title, int playingTime, String director) {
        super(title, playingTime);
        this.director = director;
        System.out.println("DVD");

    }

    public String toString() {
        return super.toString() + String.format("Director: %s%n", director);
    }
}