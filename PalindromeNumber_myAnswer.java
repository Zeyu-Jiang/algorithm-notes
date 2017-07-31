public class PalindromeNumber{
	
	 static boolean isPalindrome(int x){
		if(x < 0) return false; // if the integer x is a negative number, x is not a palindrome number. 
		int source = x;
		
		long reversedNum = 0;
		while(x > 0){
			reversedNum = reversedNum * 10 + x % 10;
			x /= 10;
			if(reversedNum > Integer.MAX_VALUE){ // a reversed number could be larger than integer.
				return false;
			}
		}
		System.out.println(reversedNum);
		if(reversedNum == source) { // after calculation, the x is equal to 0, which can no longer compared with the reversed number. 
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		int number = 11;
		System.out.println(isPalindrome(number));
	}
}