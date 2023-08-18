// Decision Making, Control Flow Statements

class opcf
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=10;

		
		if((a==10)|(b==20)) //checks both conditions (Bitwise Inclusive OR operator)
		{

			System.out.println(a+"   "+b);// 
		}
		int c=10;
		int d=10;
		if((c==10)||(d==101)) //Only checked first condition (Logical OR operator)
		{
			System.out.println(c+"   "+d);// 
		}
	}
}