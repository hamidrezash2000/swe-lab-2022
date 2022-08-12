package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.IranianGardenFactory;
import AbstractFactoryPattern.Factory.JapaneseGardenFactory;
import AbstractFactoryPattern.Flower.Flower;
import AbstractFactoryPattern.Flower.IranianFlower;
import AbstractFactoryPattern.Flower.JapaneseFlower;
import AbstractFactoryPattern.Tree.IranianTree;
import AbstractFactoryPattern.Tree.JapaneseTree;
import AbstractFactoryPattern.Tree.Tree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FactoryTest {
    @Test
    public void IranianFactoryTest() {
        IranianGardenFactory factory = new IranianGardenFactory();

        Tree tree = factory.createTree();
        Flower flower = factory.createFlower();

        assertTrue(tree instanceof IranianTree);
        assertTrue(flower instanceof IranianFlower);
    }

    @Test
    public void JapaneseFactoryTest() {
        JapaneseGardenFactory factory = new JapaneseGardenFactory();

        Tree tree = factory.createTree();
        Flower flower = factory.createFlower();

        assertTrue(tree instanceof JapaneseTree);
        assertTrue(flower instanceof JapaneseFlower);
    }
}
