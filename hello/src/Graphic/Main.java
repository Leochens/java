package Graphic;
import Graphic.Point;
import Graphic.Line;
public class Main {
	public static void main(String args[])
	{
		Point start = new Point(10,10);
		Point end = new Point(100,500);
		
		Line line = new Line(start,end);
		
		System.out.println(line.toString());
		System.out.println("hello java");
	}
}
