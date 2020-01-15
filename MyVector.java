import java.util.*;

class MyVector
{
	protected Object[] elementData;																	// array of Object class which will hold the actual data
	protected int elementCount;																		// number of actual elements in a array
	protected int capacityIncrement;																	// if this is 0 then vector will grow double in size and if it is greater than zero then it will increase according to that size
	
	
	// default constructor 
	public MyVector()
	{
		this.elementData=null;
		this.capacityIncrement=0;
		this.elementCount=0;
	}
	
	// this method adds the element at the back at vector
	public void add(Object obj) throws Exception
	{
		if(this.elementData==null)
		{
			this.elementData=new Object[1];
		}
		else
		{
			this.ensureCapacity();
		}
		this.elementData[this.elementCount++]=obj;																
	}
	
	// this method checks weather the vector has sufficient size or not. If it does not has sufficient memory then new memory is allocated according to capacityIncrement characterstic.
	public void ensureCapacity()
	{
		
		if(this.elementData.length==elementCount)																
		{
			int incrementfactor=0;
			if(this.capacityIncrement==0)
			{
				
				incrementfactor=this.elementData.length * 2;
			}
			else
			{
				incrementfactor=this.elementData.length + this.capacityIncrement;
			}
			Object temp[]=new Object[incrementfactor];
			for(int i=0;i<elementCount;i++)
			{
				temp[i]=elementData[i];
			}
			this.elementData=temp;
		}
	}
	
	public void display()
	{
		for(int i=0;i<this.elementCount;i++)
		{
			System.out.print(this.elementData[i]+" ");
		}
	}
}