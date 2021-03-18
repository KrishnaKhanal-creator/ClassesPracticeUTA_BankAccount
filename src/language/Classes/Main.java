package language.Classes;

public class Main {
    public static void main(String[] args) {
        Car chevrolet = new Car();
        Car ferrari = new Car();

        chevrolet.setModel("abc");
        System.out.println("Model is " + chevrolet.getModel());
    }

}
