package java_constructor;

public class inher_demo 
{
	/*int roll_no;
	String name;
	double per;
	int[] m=new int[5];
	*/
	public int calc(int[] m)
	{
		int per,sum=0,i;
		for(i=0;i<m.length;i++)
		{
			sum+=m[i];
		}
		per=(sum*100)/500;
		System.out.println("Per="+per);
		return per;
	}	
}
