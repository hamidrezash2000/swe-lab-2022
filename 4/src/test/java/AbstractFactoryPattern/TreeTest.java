package AbstractFactoryPattern;

import AbstractFactoryPattern.Tree.IranianTree;
import AbstractFactoryPattern.Tree.JapaneseTree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TreeTest {
    @Test
    public void IranianTreeCreationTest() {
        String name = "Chenar";
        int height = 30;
        String fruit = "NoFruit";
        IranianTree tree = new IranianTree(name, height, fruit);

        assertEquals(tree.getName(), name);
        assertEquals(tree.getHeight(), height);
        assertEquals(tree.getFruit(), fruit);
    }

    @Test
    public void JapaneseTreeCreationTest() {
        String name = "J1";
        int height = 100;
        JapaneseTree tree = new JapaneseTree(name, height);

        assertEquals(tree.getName(), name);
        assertEquals(tree.getHeight(), height);
    }

    @Test
    public void IranianTreeSetName() {
        String name = "Chenar";
        int height = 30;
        String fruit = "NoFruit";
        IranianTree tree = new IranianTree(name, height, fruit);

        String newName = "Apple";

        tree.setName(newName);
        assertEquals(tree.getName(), newName);
    }

    @Test
    public void IranianTreeSetHeight() {
        String name = "Chenar";
        int height = 30;
        String fruit = "NoFruit";
        IranianTree tree = new IranianTree(name, height, fruit);

        int newHeight = 10;

        tree.setHeight(newHeight);
        assertEquals(tree.getHeight(), newHeight);
    }

    @Test
    public void IranianTreeSetFruit() {
        String name = "Chenar";
        int height = 30;
        String fruit = "NoFruit";
        IranianTree tree = new IranianTree(name, height, fruit);

        String newFruit = "Apple";

        tree.setFruit(newFruit);
        assertEquals(tree.getFruit(), newFruit);
    }

    @Test
    public void JapaneseTreeSetName() {
        String name = "J1";
        int height = 30;
        JapaneseTree tree = new JapaneseTree(name, height);

        String newName = "J2";

        tree.setName(newName);
        assertEquals(tree.getName(), newName);
    }

    @Test
    public void JapaneseTreeSetHeight() {
        String name = "J1";
        int height = 30;
        JapaneseTree tree = new JapaneseTree(name, height);

        int newHeight = 10;

        tree.setHeight(newHeight);
        assertEquals(tree.getHeight(), newHeight);
    }

}
