package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Flower.Flower;
import AbstractFactoryPattern.Flower.IranianFlower;
import AbstractFactoryPattern.Tree.IranianTree;
import AbstractFactoryPattern.Tree.Tree;

public class IranianGardenFactory implements GardenFactory{
    @Override
    public Tree createTree() {
        return new IranianTree("Sib", 10, "Apple");
    }

    @Override
    public Flower createFlower() {
        return new IranianFlower("Zanbagh", "yellow");
    }
}
