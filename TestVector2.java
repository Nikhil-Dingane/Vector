import java.util.*;
import java.util.concurrent.TimeUnit;

class TestVector2
{
	public static void main(String arg[]) throws Exception
	{
		
		long startTime;
		long endTime;
		

		MyVector mobj=new MyVector();
		
		startTime=System.nanoTime();
		
		for(int i=0;i<250000000;i++)
		{
			mobj.add(i);
		}
		
		endTime=System.nanoTime();
		
		System.out.println("Required time for insertion in my vector is : "+ (endTime-startTime)+" ns");
		System.out.println("current Size of my vector is : "+ mobj.size());
		System.out.println("current capacity of my vector is : "+ mobj.capacity());
	}
}