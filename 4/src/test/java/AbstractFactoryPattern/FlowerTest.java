package AbstractFactoryPattern;

import AbstractFactoryPattern.Flower.IranianFlower;
import AbstractFactoryPattern.Flower.JapaneseFlower;
import AbstractFactoryPattern.Tree.IranianTree;
import AbstractFactoryPattern.Tree.JapaneseTree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlowerTest {
    @Test
    public void IranianFlowerCreationTest() {
        String name = "Zanbagh";
        String color = "red";
        IranianFlower flower = new IranianFlower(name, color);

        assertEquals(flower.getName(), name);
        assertEquals(flower.getColor(), color);
    }

    @Test
    public void JapaneseFlowerCreationTest() {
        String name = "JFlower";
        String color = "yellow";
        JapaneseFlower flower = new JapaneseFlower(name, color);

        assertEquals(flower.getName(), name);
        assertEquals(flower.getColor(), color);
    }

    @Test
    public void IranianFlowerSetNameTest() {
        String name = "Zanbagh";
        String color = "red";
        IranianFlower flower = new IranianFlower(name, color);

        String newName = "Yas";
        flower.setName(newName);
        assertEquals(flower.getName(), newName);
    }

    @Test
    public void JapaneseFlowerSetNameTest() {
        String name = "JFlower1";
        String color = "red";
        JapaneseFlower flower = new JapaneseFlower(name, color);

        String newName = "JFlower2";
        flower.setName(newName);
        assertEquals(flower.getName(), newName);
    }

    @Test
    public void IranianFlowerSetColorTest() {
        String name = "Zanbagh";
        String color = "red";
        IranianFlower flower = new IranianFlower(name, color);

        String newColor = "yellow";
        flower.setColor(newColor);
        assertEquals(flower.getColor(), newColor);
    }

    @Test
    public void JapaneseFlowerSetColorTest() {
        String name = "JFlower1";
        String color = "red";
        JapaneseFlower flower = new JapaneseFlower(name, color);

        String newColor = "blue";
        flower.setColor(newColor);
        assertEquals(flower.getColor(), newColor);
    }
}
