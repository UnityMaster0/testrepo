package classes;

public class Parent {

    public int id;
    
    public Parent() {

        this.id = 0;
    }
    
    public Parent(int id) {

        this.id = id;
    }

    public String getEmployeeDetails() {
        return "ID: " + id;
    }
}