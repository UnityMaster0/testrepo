package constructors;
public class Constructor {

    private int one;
    private int two;
    private int three;

    public Constructor(int x, int y, int z) {
        one = x;
        two = y;
        three = z;
    }

    public int outputSum() {
        return one + two + three;
    }
}
