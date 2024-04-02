package JavaClasses.class1;

public class X {
    private int i;
    private int j;

    public int getI() {return i;}
    public int getJ() {return j;}
    public void setI(int i1) {
        i = i1;
    };
    public void setJ(int j) {
        this.j = j;
    };

    // constructors
    public X (int i, int j) {
        this.i = i;
        setJ(j);

    }
    // αντίγραφο
    public X (X x) {
        this(x.i, x.j);
        // or
        //this.i = x.getI();
        //this.j = x.getJ();
    }
    public X () {}


}
