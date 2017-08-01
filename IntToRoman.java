class IntToRoman{

	static String intToRoman(int num){
		String m[] = {"","M","MM","MMM"};
		String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

		int[] digit = new int[4];
		for(int index = 0; index < 4; index++){
			digit[index] = num % 10;
			num /= 10;
		}

		String roman = "";
		roman = roman.concat(m[digit[3]]);
		roman = roman.concat(c[digit[2]]);
		roman = roman.concat(x[digit[1]]);
		roman = roman.concat(i[digit[0]]);

		return roman;
	}

	public static void main(String[] args){
		int num = 3456;
		System.out.println(intToRoman(num));
	}
}