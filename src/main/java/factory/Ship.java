package factory;

public class Ship extends Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering goods by the sea");
    }
}
