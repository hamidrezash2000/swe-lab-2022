package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Flower.Flower;
import AbstractFactoryPattern.Tree.Tree;

public interface GardenFactory {
    public Tree createTree();

    public Flower createFlower();
}
