// Bitwise left-shift and right-shift operations with assignment.

class _9_Bitwise2
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=a << (2 + a) >> 1;   // 3<<5 >>1
		System.out.println(b);      

		int m=5;
		int n=m<<(8-m)<<2;         // 5<<3 <<2
		System.out.println(n);
	}
}
