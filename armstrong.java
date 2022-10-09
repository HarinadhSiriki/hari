public class armstrong {

	public static void main(String[] args) {
		
		
		int num=153,tem,total=0;
		int number=num;
		
		while( number>0)
		{
			tem=number%10;
			total=total+(tem*tem*tem);
			number = number/10;
		}
		if ( total==num)
			System.out.println(" armstrong ");
		else
			System.out.println(" not a armstrongs");

	}

}