// Operations using boolean logical operators including unary logical negation ( ! ), binary logical AND ( & ), OR ( | ), and exclusive OR ( ^ )

class BooleanLogical 
{
	public static void main(String[] args) 
	{
		boolean s1=true;
		boolean s2=false;

		System.out.println(s1&s2); // F 
		System.out.println(s1&s1); // T
		System.out.println(s2&s2); // F
		System.out.println(s2&s1); // F

		System.out.println("--------------------------------");
		System.out.println(s1|s1); // 
		System.out.println(s1|s2); //
		System.out.println(s2|s1); // 
		System.out.println(s2|s2); // 

		System.out.println("--------------------------------");
		System.out.println(s1^s1); // 
		System.out.println(s1^s2); //
		System.out.println(s2^s1); // 
		System.out.println(s2^s2); // 

	
		
	}
}