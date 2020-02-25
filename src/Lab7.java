public class Lab7
{
	public static void main(String[] args)
	{
//		System.out.println("Hello from GIT!");
//		System.out.println("Hello from GIT again!");
		
		String s = "Hello World!";
		s = s.toUpperCase();
		
		String s2 = "aererereragfdkdfgdmgi";
		s2 = s2.toUpperCase();
		
		System.out.println("Number of vowels: " + 
		RecursiveVowelChecker(s));
		
		System.out.println("Number of vowels: " + 
				RecursiveVowelChecker(s2));
	}
	
	public static int RecursiveVowelChecker(String input)
	{
		int vowels = 0;
		
		if(input.length() <= 0)
		{
			return vowels;
		}
		
		if(input.charAt(0) == 'A' || input.charAt(0) == 'E' 
				|| input.charAt(0) == 'I' || input.charAt(0) == 'O'
				|| input.charAt(0) == 'U' || input.charAt(0) == 'Y')
		{
			vowels++;
		}
		
		return RecursiveVowelChecker( input.substring(1) ) + vowels;
	}
}

//int amountOfVowels = 0;
//for(int i = 0; i < s.length(); i++)
//{
//	if(s.charAt(i) == 'A' || s.charAt(i) == 'E' 
//			|| s.charAt(i) == 'I' || s.charAt(i) == 'O'
//			|| s.charAt(i) == 'U' || s.charAt(i) == 'Y')
//	{
//		amountOfVowels++;
//	}
//}
