class DisariumNumber
{
	static boolean check(int n)
	{
		int DigitCounter = Integer.toString(n).length();

		int sum = 0; 
		int temp = n;
		while (temp!=0)
		{
			int r = temp%10;
			sum = (int) (sum + Math.pow(r, DigitCounter--));
			temp = temp/10;
		}
	
		return (sum == n);
	}
	
	public static void main(String[] args)
	{
		int n = 89;
		
		System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
	}
}