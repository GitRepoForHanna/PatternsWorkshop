package abstract_factory.factories;

import abstract_factory.mug.Mug;
import abstract_factory.mug.WoodenMug;
import abstract_factory.plate.Plate;
import abstract_factory.plate.WoodenPlate;
import abstract_factory.spoon.Spoon;
import abstract_factory.spoon.WoodenSpoon;

public class WoodenDishesFactory extends DishesFactory {

    @Override
    public Spoon createSpoon() {
        return new WoodenSpoon();
    }

    @Override
    public Plate createPlate() {
        return new WoodenPlate();
    }

    @Override
    public Mug createMug() {
        return new WoodenMug();
    }
}
