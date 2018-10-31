public class shapetest {

	import java.util.ArrayList;
	import java.util.Collections;
	import java.lang.reflect.*;

	import org.junit.Test;

	import pkg_Shapes.Cuboid;
	import pkg_Shapes.Cuboid.Area;
	import pkg_Shapes.Cuboid.Volume;
	import pkg_Shapes.Rectangle;

	public class Shapes_Tests {

		
		@Test
		public void Rectangle_Test1() {
			Rectangle rect1 = new Rectangle(5, 6);
			assertTrue(rect1 instance Rectangle);
		}
	
		@Test
		public void RectanglegetiLength_Test1() {
			Rectangle rect1 = new Rectangle(5, 6);
			assertTrue(rect1.getiLength() == 5);
		}
	
		@Test
		public void RectanglesetiLength_Test1() {
			Rectangle rect1 = new Rectangle(5, 6);
			rect1.setiLength(7);
			assertTrue(rect1.getiLength() == 7);
		}
	
		@Test
		public void RectanglegetiWidth_Test1() {
			Rectangle rect1 = new Rectangle(5, 6);
			assertTrue(rect1.getiWidth() == 6);
		}
	
		@Test
		public void RectanglesetiWidth_Test1() {
			Rectangle rect1 = new Rectangle(3, 4);
			rect1.setiWidth(6);
			assertTrue(rect1.getiWidth() == 6);
		}
	
		@Test
		public void RectangleArea_Test1() {
			Rectangle rect1 = new Rectangle(3, 4);
			assertTrue(rect1.area() == 12.0);
		}
		
		@Test
		public void RectanglePerimeter_Test1() {
			Rectangle rect1 = new Rectangle(4, 8);
			assertTrue(rect1.perimeter() == 24.0);
		}
	
		@Test
		public void RectangleCompareTo_Test1() {
			Rectangle rect1 = new Rectangle(4, 8);
			Rectangle rect2 = new Rectangle(9, 10);
			Rectangle rect3 = new Rectangle(8, 9);
			ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();
			rectList.add(rect1);
			rectList.add(rect2);
			rectList.add(rect3);
			Collections.sort(rectList);
			assertTrue(rectList.get(0).area() == 32);
			assertTrue(rectList.get(1).area() == 90);
			assertTrue(rectList.get(2).area() == 72);
		}
		
		@Test
		public void Cuboid_Test1() {
			Cuboid cub1 = new Cuboid(3, 4, 5);
			assertTrue(cub1 instanceof Cuboid);
		}
	
		@Test
		public void CuboidiLength_Test1() {
			Cuboid cub1 = new Cuboid(3, 4, 5);
			assertTrue(cub1.getiLength() == 3);
		}
		
		@Test
		public void CuboidsetiLength_Test1() {
			Cuboid cub1 = new Cuboid(7, 8, 9);
			cub1.setiLength(5);
			assertTrue(cub1.getiLength() == 5);
		}

		@Test
		public void CuboidgetiWidth_Test1() {
			Cuboid cub1 = new Cuboid(7, 8, 9);
			assertTrue(cub1.getiWidth() == 8);
		}
		
		@Test
		public void CuboidsetiWidth_Test1() {
			Cuboid cub1 = new Cuboid(7, 8, 9);
			cub1.setiWidth(5);
			assertTrue(cub1.getiWidth() == 5);
		}
	
		@Test
		public void CuboidgetiDepth_Test1() {
			Cuboid cub1 = new Cuboid(1,2, 3);
			assertTrue(cub1.getiDepth() == 5);
		}
	
		@Test
		public void CuboidsetiDepth_Test1() {
			Cuboid cub1 = new Cuboid(1, 2, 3);
			cub1.setiDepth(6);
			assertTrue(cub1.getiDepth() == 3);
		}
	
		@Test
		public void CuboidArea_Test1() {
			Cuboid cub1 = new Cuboid(7, 9, 10);
			assertTrue(cub1.area() == 630.0);
		}
		
		@Test
		public void CuboidPerimeter_Test1() {
			boolean thrownE = false;
			try {
				Cuboid cub1 = new Cuboid(8, 9, 10);
				cub1.perimeter();
			} catch(UnsupportedOperationException unsupportedOperationException) {
				thrownE = true;
			}
			assertTrue(thrownE);
		}
	
		@Test
		public void CuboidVolume_Test1() {
			Cuboid cub1 = new Cuboid(9, 10, 11);
			assertTrue(cub1.volume() == 990.0);
		}
	
		@Test
		public void CuboidCompareTo_Test1() {
			Cuboid cubCompare = new Cuboid(0, 0, 0);
			Cuboid cub1 = new Cuboid(2, 3, 4);
			Cuboid cub2 = new Cuboid7, 8, 9);
			Cuboid cub3 = new Cuboid(1, 4, 16);
			ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
			cubList1.add(cub1);
			cubList1.add(cub2);
			cubList1.add(cub3);
			SortByArea sortByArea;
			try {
				Class<?> clsSortbyarea = Class.forName("pkg_Shapes.CuboidSortByArea");
				Constructor<?> constrSortbyarea = clsSortbyarea.getDeclaredConstructor(new Class[] {Cuboid.class});
				constrSortbyarea.setAccessible(true);
				sortByArea = (SortByArea) constrSortbyarea.newInstance(cubCompare);
				Collections.sort(cubList1, sortByArea);
				assertTrue(cubList1.get(0).area() == 24.0);
				assertTrue(cubList1.get(1).area() == 504.0);
				assertTrue(cubList1.get(2).area() == 64.0);
			
			}
			SortByVolume sortByVolume;
			try {
				Class<?> clsSortbyvolume = Class.forName("pkg_Shapes.CuboidSortByVolume");
				Constructor<?> constrSortbyvolume = clsSortbyvolume.getDeclaredConstructor(new Class[] {Cuboid.class});
				constrSortbyvolume.setAccessible(true);
				sortByVolume = (SortByVolume) constrSortbyvolume.newInstance(cubCompare);
				Collections.sort(cubList1, sortByVolume);
				assertTrue(cubList1.get(0).volume() == 36.0);
				assertTrue(cubList1.get(1).volume() == 60.0);
				assertTrue(cubList1.get(2).volume() == 120.0);
		

		}
	
		@Test
		public void CuboidCompareTo_Test2() {
			Cuboid cub1 = new Cuboid(2, 3, 4);
			Cuboid cub2 = new Cuboid(7, 8, 9);
			Cuboid cub3 = new Cuboid(1, 4, 16);
			ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
			cubList1.add(cub1);
			cubList1.add(cub2);
			cubList1.add(cub3);
			Collections.sort(cubList1);
			assertTrue(cubList1.get(0).area() == 24.0);
			assertTrue(cubList1.get(1).area() == 504.0);
			assertTrue(cubList1.get(2).area() == 64.0);

		}

	}
	}

}
