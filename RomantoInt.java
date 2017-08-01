class RomantoInt{

	public static int romanToInt(String roman){
		int sum = 0;

		if(roman.indexOf("IV") != -1) sum -= 2;
		if(roman.indexOf("IX") != -1) sum -= 2;
		if(roman.indexOf("XL") != -1) sum -= 20;
		if(roman.indexOf("XC") != -1) sum -= 20;
		if(roman.indexOf("CD") != -1) sum -= 200;
		if(roman.indexOf("CM") != -1) sum -= 200;

		for(int i = 0; i < roman.length(); i++){
			if(roman.charAt(i) == 'I') sum += 1;
			if(roman.charAt(i) == 'V') sum += 5;
			if(roman.charAt(i) == 'X') sum += 10;
			if(roman.charAt(i) == 'L') sum += 50;
			if(roman.charAt(i) == 'C') sum += 100;
			if(roman.charAt(i) == 'D') sum += 500;
			if(roman.charAt(i) == 'M') sum += 1000;
		}

		return sum;
	}

	public static void main(String[] args){
		System.out.println(romanToInt("MMMDCCCXCIV"));
	}
}