// Ternary operation example 2

class Ternary2 
{
	public static void main(String[] args) 
	{
		int a=17,b=7,c=16;
		int res = (a<b) ? (c>b) ? c : b :(c>a) ? c:a;
        
        // Approach :
        // 1. analyze the innermost ternary operator (c > b) ? c : b
        // 2. we get, (a<b) ? 16 : (c>a) ? c:a
        // 3. analyze the outer ternary operator (a<b) ? 16 : (c>a) ? c:a
        // 4. a < b evaluates to 'false' (since 17 is not less than 7).
		// 5. Therefore, the expression moves to the second part: (c > a) ? c : a
        // 6. Since, c>a evaluates to 'false'. Therefore, the expression evaluates to a, which is 17 .

        System.out.println(res);
	}
}