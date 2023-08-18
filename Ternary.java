//Code to demonstrate the use and behavior of Ternary operator


class Ternary 
{
	public static void main(String[] args) 
	{
		int x=5;
		int y=3;
		int max = (x > y) ? x : y; // Explanation: if (x > y) is true, x is printed(i.e. Left side of :). Else, y (i.e. Right side of :).
		System.out.println(max);
	}
}
