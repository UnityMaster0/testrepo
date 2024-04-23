import mytools.Circuit;

public class Test {
    public static void main(String[] arg) {
        Circuit newCirc = new Circuit(107000, 180);
        System.out.println(newCirc.fullAdder());
    }
}
