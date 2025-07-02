package Day02_OopsJava;

public class MainOop {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Vehicle obj1 = new Car();
        Vehicle obj2 = new Bike();

        obj.startEngine();
        obj1.startEngine();
        obj2.startEngine();
    }
}
