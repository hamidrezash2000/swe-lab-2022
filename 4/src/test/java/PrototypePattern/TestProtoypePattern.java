package PrototypePattern;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestProtoypePattern {
    public static Rectangle rectangle;
    public static Circle circle;

    @BeforeClass
    public static void beforeClass() {
        rectangle = new Rectangle(10, 20, "RED", 40, 50);
        circle = new Circle(15, 25, "BLUE", 40);
    }

    @Test
    public void testRectangleFieldsCloned() throws CloneNotSupportedException {
        Rectangle cloned_rectangle = rectangle.clone();
        Assert.assertEquals(rectangle.getWidth(), cloned_rectangle.getWidth());
        Assert.assertEquals(rectangle.getHeight(), cloned_rectangle.getHeight());
        Assert.assertEquals(rectangle.getColor(), cloned_rectangle.getColor());
        Assert.assertEquals(rectangle.getX(), cloned_rectangle.getX());
        Assert.assertEquals(rectangle.getY(), cloned_rectangle.getY());
    }

    @Test
    public void testCircleFieldsCloned() throws CloneNotSupportedException {
        Circle cloned_circle = circle.clone();
        Assert.assertEquals(circle.getRadius(), cloned_circle.getRadius());
        Assert.assertEquals(circle.getColor(), cloned_circle.getColor());
        Assert.assertEquals(circle.getX(), cloned_circle.getX());
        Assert.assertEquals(circle.getY(), cloned_circle.getY());
    }
}
