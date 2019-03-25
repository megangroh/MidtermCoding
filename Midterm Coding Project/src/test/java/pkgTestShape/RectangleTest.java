package pkgTestShape;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

@Test
public void constructorTest() {
	Rectangle rec = new Rectangle(5,6);
}

@Test
(expected = IllegalArgumentException.class)
public void constructorTest2() {
	Rectangle rec = new Rectangle(5,-6);
}

@Test
public void RectangleTest() {
Rectangle rec = new Rectangle(5,6);
assertEquals(rec.getLength(),5);
}

@Test 
public void getLengthTest() {
Rectangle rec = new Rectangle(5,6);
assertEquals(rec.getLength(),5);
}

@Test
public void getWidthTest() {
Rectangle rec = new Rectangle(5,6);
assertEquals(rec.getWidth(),6);
}

@Test
public void setLengthTest() {
Rectangle rec = new Rectangle(5,6);
rec.setLength(3);
assertEquals(rec.getLength(), 3);
}

@Test
public void setWidthTest() {
Rectangle rec = new Rectangle(5,6);
rec.setLength(4);
assertEquals(rec.getLength(), 4);
}

@Test
public void areaTest() {
	Rectangle rec = new Rectangle(5,6);
	assertTrue(rec.area()== 30);
}
@Test	
public void perimeterTest() {
	Rectangle rec = new Rectangle(5,6);
	assertTrue(rec.perimeter()== 22);
}

	
	
}


