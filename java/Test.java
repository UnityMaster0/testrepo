import mytools.Circuit;

public class Test {
    public static void main(String[] arg) {
        Circuit newCirc = new Circuit(2, 3);
        System.out.println(newCirc.fullAdder());
    }
}
