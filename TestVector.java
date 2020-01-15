import java.util.*;
import java.util.concurrent.TimeUnit;

class TestVector
{
	public static void main(String arg[]) throws Exception
	{
		Vector vobj=new Vector();
		long startTime=System.nanoTime();
		for(int i=0;i<1000000;i++)
		{
			vobj.add(i);
		}
		long endTime=System.nanoTime();
		
		System.out.println("Required time for insertion in inbuilt vector is : "+ (endTime-startTime)+" ns");
		System.out.println("current Size of inbuilt vector is : "+ vobj.size());
		System.out.println("current capacity of inbuilt vector is : "+ vobj.capacity());
		
		MyVector mobj=new MyVector();
		startTime=System.nanoTime();
		for(int i=0;i<1000000;i++)
		{
			mobj.add(i);
		}
		endTime=System.nanoTime();
		
		System.out.println("Required time for insertion in my vector is : "+ (endTime-startTime)+" ns");
		System.out.println("current Size of my vector is : "+ mobj.size());
		System.out.println("current capacity of my vector is : "+ mobj.capacity());
	}
}