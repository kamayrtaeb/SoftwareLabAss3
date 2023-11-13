import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.computeArea());
    }

    @Test
    public void testSetAndGet() {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setWidth(8);
        rectangle.setHeight(15);

        assertEquals(8, rectangle.getWidth());
        assertEquals(15, rectangle.getHeight());
    }

    @Test
    public void testSquare() {
        Square square = new Square(5);
        assertEquals(25, square.computeArea());
    }
}
