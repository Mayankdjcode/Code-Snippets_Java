//Performing basic operations with arithmetic operators and identifying their behavior

class Operators
{
	
	public static void main(String[] args) 
	{


		int a=20;
		int b=5;
		
		int add = a+b; //20+5=25
		int sub = a-b;
		int div = a/b;
		int mod = a%b;
		System.out.println("a+b = "+ add);
		System.out.println("a-b = "+ sub);
		System.out.println("a/b = "+ div);
		System.out.println("a%b = "+ mod); // gives remainder on division, a/b
		System.out.println("a+b = "+ a+b);
		System.out.println(a+b +" = a+b");
	}
}