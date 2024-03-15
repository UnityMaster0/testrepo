package mytools;

public class Constructor {

    private int one;
    private int two;
    private int three;

    public Constructor(int x, int y, int z) {
        one = x;
        two = y;
        three = z;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int x) {
        this.one = x;
    }

    public int outputSum() {
        return one + two + three;
    }
}
