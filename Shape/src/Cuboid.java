import java.util.*;
import java.lang.*;
import java.io.*;

public class *Cuboid.java extends Rectangle implements Comparable <Object> {

	int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth,iLength);
		this.iDepth = iDepth;
	}
	
	
	
		private int getDepth() {
			return iDepth;
	}

public void setDepth(int iDepth) {
	this.iDepth = iDepth;
}

	public double volume() {
		// A = w* l
		return this.iWidth * this.iLength * this.iDepth
	}
	
	@Override
	public double area() {
		// A = w * l

		if (cube1.area()>cube2.area()) {
	
c double volume() {
				return super.area() * iDepth;
			}
			@Override
			public double perimeter() throws UnsupportedOperationException{
				
			}
		
			public class SortByArea implements Comparator<Cuboid>{

				SortByArea() {
					
				}
				@Override
				public int compare(Cuboid cub1, Cuboid cub2) {
					if (cub1.area() > cub2.area()) {
						return 1;
					} else if(cub1.area() < cub2.area()) {
						return -1;
					} else {
						return 0;
					}
				}
				
			}
		
			public class SortByVolume implements Comparator<Cuboid>{

				SortByVolume() {
					
				}
				@Override
				public int compare(Cuboid cub1, Cuboid cub2) {
					if (cub1.volume() > cub2.volume()) {
						return 1;
					} else if(cub1.volume() < cub2.volume()) {
						return -1;
					} else {
						return 0;
	
}
}
