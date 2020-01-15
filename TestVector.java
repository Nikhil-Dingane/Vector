import java.util.*;
import java.util.concurrent.TimeUnit;

class TestVector
{
	public static void main(String arg[]) throws Exception
	{
		Vector<Integer> vobj=new Vector<Integer>();
		long endTime;
		long startTime;
		
		 startTime=System.nanoTime();
		 
		 for(int i=0;i<250000000;i++)
		{
			vobj.add(i);
		}
		
		 endTime=System.nanoTime();
		
		System.out.println("Required time for insertion in inbuilt vector is : "+ (endTime-startTime)/1000000000.0+" s");
		System.out.println("current Size of inbuilt vector is : "+ vobj.size());
		System.out.println("current capacity of inbuilt vector is : "+ vobj.capacity());
		
		
	}
}