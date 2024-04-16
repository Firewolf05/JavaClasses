package JavaClasses.class6.Ex1;

public class Clock {

    private int h, m, s;

    public void setH(int h) {
        if ((h>=0) && (h<=23)) {
            this.h = h;
        }
    }

    public void setM(int m) {
        if ((m >= 0) && (m <= 59)) {
            this.m = m;
        }
    }

    public void setS(int s) {
        if ((s >= 0) && (s <= 59)) {
            this.s = s;

        }
    }

    public Clock(int h, int m, int s) {
        setH(h);
        setM(m);
        setS(s);
    }

    public void Tick() {
        if (s!=59) {
            s+=1;
        } else {
            s=0;
            if (m!=59) m++;
            else {
                m =0;
                if (h!=23) h++;
                else {
                    h=0;
                }
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d%n", h, m, s);
    }

}
