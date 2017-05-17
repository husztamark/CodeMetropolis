import static org.junit.Assert.*;

import org.junit.Test;

import codemetropolis.toolchain.commons.cmxml.Buildable;
import codemetropolis.toolchain.commons.cmxml.Point;
import codemetropolis.toolchain.commons.cmxml.Buildable.Type;


public class BuildableTest {
	
	private static Point position = new Point(10,10,10);
	private static Point size = new Point(2,2,2);
	private Point center = new Point(
			position.getX() + size.getX() / 2,
			position.getY() + size.getY() / 2,
			position.getZ() + size.getZ() / 2);
	private Buildable testbuildable = new Buildable("iden", "Test",Type.FLOOR,position,size);

	@Test
	public void testBuildableStringStringType() {
		assertNotNull(new Buildable("1","Test",Type.FLOOR));
	}

	@Test
	public void testBuildableStringStringTypePointPoint() {
		assertNotNull(new Buildable("1","Test",Type.FLOOR,position,size));
	}

	@Test
	public void testGetCenter() {
		assertEquals(center.getX(), testbuildable.getCenter().getX());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Test",testbuildable.getName());
	}

	@Test
	public void testSetName() {
		testbuildable.setName("nev");
		assertEquals("nev",testbuildable.getName());
	}

	@Test
	public void testGetType() {
		assertEquals(Type.FLOOR, testbuildable.getType());
	}

	@Test
	public void testSetType() {
		testbuildable.setType(Type.CELLAR);
		assertNotEquals(Type.FLOOR, testbuildable.getType());
	}

	@Test
	public void testGetPositionX() {
		assertEquals(10,testbuildable.getPositionX());
	}

	@Test
	public void testGetPositionY() {
		assertEquals(10,testbuildable.getPositionY());
	}

	@Test
	public void testGetPositionZ() {
		assertEquals(10,testbuildable.getPositionZ());
	}

	@Test
	public void testSetPositionX() {
		testbuildable.setPositionX(11);
		assertNotEquals(10,testbuildable.getPositionX());
	}

	@Test
	public void testSetPositionY() {
		testbuildable.setPositionY(11);
		assertNotEquals(10,testbuildable.getPositionY());
	}

	@Test
	public void testSetPositionZ() {
		testbuildable.setPositionZ(11);
		assertNotEquals(10,testbuildable.getPositionZ());
	}

	@Test
	public void testGetSizeX() {
		assertEquals(2,testbuildable.getSizeX());
	}

	@Test
	public void testGetSizeY() {
		assertEquals(2,testbuildable.getSizeY());
	}

	@Test
	public void testGetSizeZ() {
		assertEquals(2,testbuildable.getSizeZ());
	}

	@Test
	public void testSetSizeX() {
		testbuildable.setSizeX(4);
		assertNotEquals(10,testbuildable.getSizeX());
	}

	@Test
	public void testSetSizeY() {
		testbuildable.setSizeY(4);
		assertNotEquals(10,testbuildable.getSizeY());
	}

	@Test
	public void testSetSizeZ() {

		testbuildable.setSizeZ(4);
		assertNotEquals(10,testbuildable.getSizeZ());
	}

	@Test
	public void testGetBuiltMetric1() {
		testbuildable.setBuiltMetric1(10);
		assertNotEquals(11, testbuildable.getBuiltMetric1());
	}

	@Test
	public void testSetBuiltMetric1() {
		testbuildable.setBuiltMetric1(20);
		assertEquals(20,testbuildable.getBuiltMetric1());
	}

	@Test
	public void testGetBuiltMetric2() {
		testbuildable.setBuiltMetric2(10);
		assertNotEquals(11, testbuildable.getBuiltMetric2());
	}

	@Test
	public void testSetBuiltMetric2() {
		testbuildable.setBuiltMetric2(20);
		assertEquals(20,testbuildable.getBuiltMetric2());
	}

	@Test
	public void testGetBuiltMetric3() {
		testbuildable.setBuiltMetric3(10);
		assertNotEquals(11, testbuildable.getBuiltMetric3());
	}

	@Test
	public void testSetBuiltMetric3() {
		testbuildable.setBuiltMetric3(20);
		assertEquals(20,testbuildable.getBuiltMetric3());
	}
	
	@Test
	public void testGetParent() {
		assertEquals(null, testbuildable.getParent());
	}

	@Test
	public void testIsRoot() {
		assertNotEquals(null, testbuildable.isRoot());
	}

	@Test
	public void testGetId() {
		assertEquals("iden", testbuildable.getId());
	}

	@Test
	public void testGetCdfNames() {
		testbuildable.setCdfNames("cdf");
		assertEquals("cdf", testbuildable.getCdfNames());
	}

	@Test
	public void testSetCdfNames() {
		testbuildable.setCdfNames("cdf");
		assertNotEquals("cdfefg", testbuildable.getCdfNames());
	}
}
