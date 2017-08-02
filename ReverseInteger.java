/**
* Sevseral questions should be considered.
* 1. The integer could be negative.
* 2. The reversed integer might be exceeds integer scope.
* 3. How to deal with the digital 0.
*/

public class reverseInteger{
	
	public static int reverse(int source){
		long reversedNum = 0; // define the reversed number as long type. When returning it, change it back to integer type.
		int num = Math.abs(source);
		while(num > 0){
			reversedNum = reversedNum * 10 + num % 10;
			if( reversedNum > Integer.MAX_VALUE) return 0;
			num /= 10;
		}
		
		if(source < 0){
			reversedNum = 0 - reversedNum;
			return (int)reversedNum;
		}

		return (int)reversedNum;
	}

	public static void main(String[] args){
		System.out.println(reverse(-312));
		System.out.println(reverse(482930));
		System.out.println(reverse(2147483647));
	}
}
