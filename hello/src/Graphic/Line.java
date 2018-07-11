package Graphic;
import Graphic.Point;
public class Line {
	
	public Point start,end;
	
	public Line(Point start,Point end)
	{
		this.start=start;
		this.end=end;
	}
	public Line()
	{
		
	}
	public String toString()
	{
		return this.getClass().getName()+"("+this.start.toString()+","+this.end.toString()+")";
	}
	
}
