package pkgTestShape;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {

	@Test
	public void constructorTest() {
		Cubiod cub = new Cuboid(5,6,7);
	}

	@Test
	(expected = IllegalArgumentException.class)
	public void constructorTest2() {
		Cuboid cub = new Cuboid(5,-6,7);
	}
	
	

	@Test
	public CuboidTest() {
	Cuboid cub = new Cuboid(5,6,7);
	assertEquals(cub.getLength(),5);
	}

	@Test 
	public void getLengthTest() {
	Cuboid cub = new Cuboid(5,6,7);
	assertEquals(cub.getLength(),5);
	}

	@Test
	public void getWidthTest() {
	Cuboid cub = new Cuboid(5,6,7);
	assertEquals(cub.getWidth(),6);
	}
	
	@Test
	public void getDepthTest() {
	Cuboid cub = new Cuboid(5,6,7);
	assertEquals(cub.getDepth(),7);
	}

	@Test
	public void setLengthTest() {
	Cuboid cub = new Cuboid(5,6,7);
	cub.setLength(3);
	assertEquals(cub.getLength(), 3);
	}

	@Test
	public void setWidthTest() {
	Cuboid cub = new Cuboid(5,6,7);
	cub.setWidth(4);
	assertEquals(cub.getWidth(),4);
	}
	
	@Test
	public void setDepthTest() {
	Cuboid cub = new Cuboid(5,6,7);
	cub.setDepth(5);
	assertEquals(cub.getDepth(),5);
	}
	
	@Test
	public void sortByAreaTest() {
		ArrayList<Cubiod> cubes= new ArrayList<Cuboid>(3);
		Cubiod cub = new Cubiod(2,2,2);
		Cubiod cub2 = new Cubiod(4,4,4);
		Cubiod cub3 = new Cubiod(6,6,6);
		
		cubes.add(cub2);
		cubes.add(cub1);
		cubes.add(cub);
		
		ArrayList<Cubiod> expected= new ArrayList<Cuboid>(3);
		
		expected.add(cub);
		expected.add(cub1);
		expected.add(cub2);
		
		Collections.checkedSortedMap(cubes, new Cuboid.sortByArea());
		assertTrue(cubes.equals(expected));
		
	}
	
	public void sortByVolumeTest() {
		ArrayList<Cubiod> cubes= new ArrayList<Cuboid>(3);
		Cubiod cub = new Cubiod(2,2,2);
		Cubiod cub2 = new Cubiod(4,4,4);
		Cubiod cub3 = new Cubiod(6,6,6);
		
		cubes.add(cub2);
		cubes.add(cub1);
		cubes.add(cub);
		
		ArrayList<Cubiod> expected= new ArrayList<Cuboid>(3);
		
		expected.add(cub);
		expected.add(cub1);
		expected.add(cub2);
		
		Collections.checkedSortedMap(cubes, new Cuboid.sortByVolume());
		assertTrue(cubes.equals(expected));
	
		
	}
}
