package factory;

public class TransportFactory {

    public static Transport createTransportInstance(DeliveryWay deliveryWay) {
        switch (deliveryWay) {
            case OVERLAND:
                return new Truck();
            case SEA:
                return new Ship();
            case AIR:
                return new Plane();
            default:
                return new Truck();
        }
    }
}
