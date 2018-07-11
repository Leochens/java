package Graphic;

public class Point {
	
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Point()
	{
		this(0,0);
	}
	
	public String toString()
	{
		return "Point("+this.x+","+this.y+")";
	}
	
	public int x;
	public int y;
}
