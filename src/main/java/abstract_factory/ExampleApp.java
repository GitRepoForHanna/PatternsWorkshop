package abstract_factory;

import abstract_factory.dishes_sets.CeramicSet;
import abstract_factory.dishes_sets.DishesSet;
import abstract_factory.dishes_sets.MetallicSet;
import abstract_factory.dishes_sets.WoodenSet;
import abstract_factory.factories.CeramicDishesFactory;
import abstract_factory.factories.DishesFactory;
import abstract_factory.factories.MetallicDishesFactory;
import abstract_factory.factories.WoodenDishesFactory;

import java.util.stream.Stream;

public class ExampleApp {

    public static void main(String[] args) {
        DishesFactory woodenFactory = new WoodenDishesFactory();
        DishesFactory ceramicFactory = new CeramicDishesFactory();
        DishesFactory metallicFactory = new MetallicDishesFactory();
        DishesSet woodenSet = new WoodenSet(woodenFactory);
        DishesSet ceramicSet = new CeramicSet(ceramicFactory);
        DishesSet metallicSet = new MetallicSet(metallicFactory);
        Stream.of(woodenSet, ceramicSet, metallicSet).forEach(DishesSet::describeSet);
    }
}
