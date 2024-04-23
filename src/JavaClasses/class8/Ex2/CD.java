package JavaClasses.class8.Ex2;

public class CD extends Item {
    private String artist;
    private int numTrucks;

    public CD(String title, int playingTime, String artist, int numTrucks) {
        super(title, playingTime);
        this.artist = artist;
        this.numTrucks = numTrucks;
        System.out.println("CD");

    }

    public String toString() {
        return super.toString() + String.format("Artist: %s%nTracks: %d%n", artist, numTrucks);
    }
}
