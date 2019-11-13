package abstract_factory.dishes_sets;

import abstract_factory.factories.DishesFactory;

public class MetallicSet extends CeramicSet {

    public MetallicSet(DishesFactory factory) {
        super(factory);
    }
}
