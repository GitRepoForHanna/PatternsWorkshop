package abstract_factory.factories;

import abstract_factory.mug.MetallicMug;
import abstract_factory.mug.Mug;
import abstract_factory.plate.MetallicPlate;
import abstract_factory.plate.Plate;
import abstract_factory.spoon.MetallicSpoon;
import abstract_factory.spoon.Spoon;

public class MetallicDishesFactory extends DishesFactory {

    @Override
    public Spoon createSpoon() {
        return new MetallicSpoon();
    }

    @Override
    public Plate createPlate() {
        return new MetallicPlate();
    }

    @Override
    public Mug createMug() {
        return new MetallicMug();
    }
}
