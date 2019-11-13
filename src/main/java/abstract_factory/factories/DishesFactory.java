package abstract_factory.factories;

import abstract_factory.mug.Mug;
import abstract_factory.plate.Plate;
import abstract_factory.spoon.Spoon;

public abstract class DishesFactory {

    public abstract Spoon createSpoon();
    public abstract Plate createPlate();
    public abstract Mug createMug();
}
