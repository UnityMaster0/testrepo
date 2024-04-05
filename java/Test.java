import mytools.Circuit;

public class Test {
    public static void main(String[] arg) {
        Circuit newCirc = new Circuit(12, 15);
        System.out.println(newCirc.fullAdder());
    }
}
