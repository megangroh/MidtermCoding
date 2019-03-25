package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int depth;
	
	public Cuboid(int length, int width, int depth) {
		super(length,width);
		if(depth<=0) {
			throw new IllegalArgumentException();
		}
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
		
	}
	
	@Override
	public double area() {
		return 2*super.getLength()*super.getWidth()+2*super.getLength()*depth+2*depth*super.getWidth();
		
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public double volume() {
		return super.getLength()*super.getWidth()*depth;
	}
	
	public int compareTo(Object cub) {
		return (int)(this.volume()-((Cuboid)cub).volume()));

	}
	
	
}

class SortByArea implements Comparator<Cuboid> {
	
	@Override
	public int compare(Cuboid cub1, Cuboid cub2) {
		if(cub1.area()>cub2.area()) {
			return 1;
		}else if (cub1.area()<cub2.area()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
class SortByVolume implements Comparator<Cuboid> {
	
	@Override
	public int compare(Cuboid cub1, Cuboid cub2) {
		if(cub1.volume()>cub2.volume()) {
			return 1;
		}else if (cub1.volume()<cub2.volume()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}



