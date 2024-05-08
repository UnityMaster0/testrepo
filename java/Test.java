import classes.Child;
import classes.Parent;
import mytools.Circuit;

public class Test {
    public static void main(String[] arg) {
        Circuit newCirc = new Circuit(107020, 18);
        System.out.println(newCirc.fullAdder());

        Parent person1 = new Parent(1); 
        Parent person2 = new Child(2, 20); 
        Child person3 = new Child(3, 10); 
        
        Parent[] employees = new Parent[] { person1, person2, person3 };
        
        for (Parent employee : employees) {
            System.out.println(employee.getEmployeeDetails());
        }
    }
}
