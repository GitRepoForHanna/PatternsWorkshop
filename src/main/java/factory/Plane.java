package factory;

public class Plane extends Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering goods by the air");
    }
}
