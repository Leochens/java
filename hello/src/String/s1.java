package String;

public class s1 {
	public static void main(String args[]) throws java.io.IOException //��Ҫ�׳��쳣
	{
		byte buffer[] = new byte[512];
		int cnt = System.in.read(buffer);
		System.in.close();
		if(cnt==2)	System.out.println("��ֻ������һ���س�");
		else if(cnt==-1) System.out.println("����");
		else
		System.out.println(new String(buffer,0,cnt-2)+" cnt= "+(cnt-2));
	}
}
