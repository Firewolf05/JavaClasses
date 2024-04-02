package JavaClasses.class1;

public class Surface {
    private String name;
    private double x;
    private double y;
    private double surface;

    public void calcSurface() {
        this.surface = this.x*this.y;
    }

    public double getSurface() {
        return(this.surface);
    }
    public Surface(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
        calcSurface();

    }
}
