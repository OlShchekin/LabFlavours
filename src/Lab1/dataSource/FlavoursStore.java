package Lab1.dataSource;

import Lab1.entities.AttributesBouquet;
import Lab1.entities.Element;
import Lab1.entities.FlavoursBouquet;

public class FlavoursStore {
    public static Element[]getElements() {
        return new Element[]{new FlavoursBouquet("Rose", 2, 70, 45),
                new FlavoursBouquet("Orchid", 50, 40, 100),
                new FlavoursBouquet("Tulip", 1, 15, 30),
                new AttributesBouquet("ribbon", 100, 70, 5)
        };
    }
}
