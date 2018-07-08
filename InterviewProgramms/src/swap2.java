
public class swap2 
{
	public static void main(String[] args)
	{
	    int a=10;
	    int b=20;
	    System.out.println("before swapping " + a + "  " +b);
	    a= a-b;
	    b=a+b;
	    a=b-a;
	    System.out.println(" after swapping " + a + " " +b );
	}

}
