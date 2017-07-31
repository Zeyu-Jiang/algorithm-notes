public class PalindromeNumber{
	
	static boolean isPalindrome(int x){
		if(x < 0 || (x != 0 && x % 10 == 0)) return false;
		int rev = 0;
		while(x > rev){
			rev = rev * 10 + x % 10;
			x /= 10;
		}
		return (x == rev || x == rev / 10);// the first condition is deal with even digits number. the second condition is deal with odd digits number.
	}

	public static void main(String[] args){
		int number = 1238321;
		System.out.println(isPalindrome(number));

	}
}