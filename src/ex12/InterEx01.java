package ex12;

public class InterEx01 implements Comparable {
    private double volume = 0;

    public InterEx01(double v) {
        volume = v;
    }

    public int CompareTo(Object otherObject) {
        InterEx01 other = (InterEx01) otherObject;
        if (this.volume < other.volume) {
            return -1;
        } else if (this.volume > other.volume)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        InterEx01 b1 = new InterEx01(100);
        InterEx01 b2 = new InterEx01(85.0);
        if (b1.CompareTo(b2) > 0) {
            System.out.println("b1이 b2보다 크다");
        } else {
            System.out.println("b2가 b1보다 크다");
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
