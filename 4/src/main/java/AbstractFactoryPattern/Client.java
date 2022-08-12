package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.GardenFactory;
import AbstractFactoryPattern.Flower.Flower;
import AbstractFactoryPattern.Tree.Tree;

public class Client {
    private GardenFactory factory;
    private Tree tree;
    private Flower flower;

    public Client(GardenFactory factory) {
        this.factory = factory;
        this.tree = factory.createTree();
        this.flower = factory.createFlower();
    }

    public GardenFactory getFactory() {
        return factory;
    }

    public void setFactory(GardenFactory factory) {
        this.factory = factory;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }
}
