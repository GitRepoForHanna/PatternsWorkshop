package abstract_factory.factories;

import abstract_factory.mug.CeramicMug;
import abstract_factory.mug.Mug;
import abstract_factory.plate.CeramicPlate;
import abstract_factory.plate.Plate;
import abstract_factory.spoon.CeramicSpoon;
import abstract_factory.spoon.Spoon;

public class CeramicDishesFactory extends DishesFactory {

    @Override
    public Spoon createSpoon() {
        return new CeramicSpoon();
    }

    @Override
    public Plate createPlate() {
        return new CeramicPlate();
    }

    @Override
    public Mug createMug() {
        return new CeramicMug();
    }
}
