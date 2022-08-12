package AbstractFactoryPattern.Tree;

public class IranianTree implements Tree{
    private String name;
    private int height;
    private String fruit;

    public IranianTree(String name, int height, String fruit) {
        this.name = name;
        this.height = height;
        this.fruit = fruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
