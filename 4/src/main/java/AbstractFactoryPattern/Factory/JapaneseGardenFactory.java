package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Flower.Flower;
import AbstractFactoryPattern.Flower.JapaneseFlower;
import AbstractFactoryPattern.Tree.JapaneseTree;
import AbstractFactoryPattern.Tree.Tree;

public class JapaneseGardenFactory implements GardenFactory{
    @Override
    public Tree createTree() {
        return new JapaneseTree("JTree", 50);
    }

    @Override
    public Flower createFlower() {
        return new JapaneseFlower("JFlower", "red");
    }
}
