package lab2;

public class Point3d extends Point2d {
	private double zCoord;
	public Point3d ( double x, double y, double z) {
		super(x,y);
		zCoord = z;
	}

	public Point3d () {
		this(0, 0, 0);
	}

	public double getZ () {
		return zCoord;
	}

	public void setZ ( double val) {
		zCoord = val;
	}
	
	public double distanceTo(Point3d p) {
		return (double)Math.sqrt(Math.pow(this.getX() - p.getX(),2) +
								 Math.pow(this.getY() - p.getY(),2) +
								 Math.pow(this.getZ() - p.getZ(),2));
	}
	
}
