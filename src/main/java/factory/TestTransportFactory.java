package factory;

public class TestTransportFactory {

    public static void main(String[] args) {
        Transport truck = TransportFactory.createTransportInstance(DeliveryWay.OVERLAND);
        Transport ship = TransportFactory.createTransportInstance(DeliveryWay.SEA);
        Transport plane = TransportFactory.createTransportInstance(DeliveryWay.AIR);
        truck.deliver();
        ship.deliver();
        plane.deliver();
    }
}
