package String;

public class s1 {
	public static void main(String args[]) throws java.io.IOException //需要抛出异常
	{
		String s = ReadLine();
		int value = MyInteger.parseInt(s);
		System.out.println("MyInteger.toString("+value+",2)="+MyInteger.toString(value,2));
		System.out.println("MyInteger.toString("+value+",8)="+MyInteger.toString(value,8));
		System.out.println("MyInteger.toString("+value+",16)="+MyInteger.toString(value,16));
		
	}
	public static String ReadLine() throws java.io.IOException
	{
		System.out.println("输入一个字符串 以回车结束输入");
		byte buffer[] = new byte[512];
		int cnt = System.in.read(buffer);
		System.in.close();
		return (cnt==-1)?null:new String(buffer,0,cnt-2);
	}
}
