// Ternary operation example 3
// Refer Ternary2.java

class _11_Ternary3
{
	public static void main(String[] args) 
	{
		int a=7,b=15;
		String s = (a>b) ? "hello" : "Hi" ;
		System.out.println(s);

		System.out.println("-------------------------");
		int a1=6;
		String s1=(a1%2==0) ? "EVEN" : "ODD" ;
		System.out.println(s1);
		
		System.out.println("-------------------------");

		int x=7 ,b1=3,c=5;
		int res = x>b1 ? x>c ? x : c : b1;
		System.out.println(res);

        System.out.println("-------------------------");

		int k=7,l=88,m=34;
		int res1=k>l?k>l?k:m:l;
		System.out.println(res1);

	}
}
