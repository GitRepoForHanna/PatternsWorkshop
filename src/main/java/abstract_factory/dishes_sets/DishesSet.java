package abstract_factory.dishes_sets;

import abstract_factory.factories.DishesFactory;
import abstract_factory.mug.Mug;
import abstract_factory.plate.Plate;
import abstract_factory.spoon.Spoon;

public abstract class DishesSet {

    private Spoon spoon;
    private Plate plate;
    private Mug mug;

    public DishesSet(DishesFactory factory) {
        spoon = factory.createSpoon();
        plate = factory.createPlate();
        mug = factory.createMug();
    }

    public void describeSet() {
        System.out.println("Dishes set contains: ");
        spoon.describe();
        plate.describe();
        mug.describe();
        System.out.println("--------------------------");
    }
}
