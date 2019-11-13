package factory;

public class Truck extends Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering goods overland");
    }
}
