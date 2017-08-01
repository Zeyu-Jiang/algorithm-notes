//This script can print out words correctly, but it can not sovle the problem of extra space.
// it could be solved by recursion.
public class IntToWords{
	public static int[][] toDigits(int num){
		int[][] digits = new int[4][4];
		
		for(int i = 0; i < 4; i++){
			for(int j = 3; j >= 0; j--){
				if(j == 3){
					digits[i][j] = 0;
					continue;
				}
				if(num == 0) break;
				digits[i][j] = num % 10;
				num /= 10;
			}
			if(num == 0) break;
		}
		return digits;
	}

	public static String[][] toWords(int num){
		String[][]  words = new String[4][4];
		int[][] digits = toDigits(num);
		String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};
		String[] tens_1 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tens_2 = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(j == 0){
					words[i][j] = hundreds[digits[i][j]];
					continue;
				}
				if(j == 1){
					if(digits[i][j] == 0) words[i][j] = "";
					if(digits[i][j] == 1) words[i][j] = tens_1[digits[i][j+1]];
					if(digits[i][j] > 1) words[i][j] = tens_2[digits[i][j]];
					continue;
				}
				if(j == 2){
					if(digits[i][j-1] == 1) words[i][j] = "";
					else words[i][j] = ones[digits[i][j]];
					continue;
				}
				if(i == 0 && j == 3) {
					words[i][j] = "";
					continue;
				}
				if(i == 1 && j == 3) {
					words[i][j] = "thousand";
					continue;
				}
				if(i == 2 && j == 3) {
					words[i][j] = "million";
					continue;
				}
				if(i == 3 && j == 3) {
					words[i][j] = "billion";
					continue;
				}
			}
		}
		return words;
	}

	public static String toString(int num){
		String[][] words = toWords(num);
		String target = new String();

		for(int i = 3; i >= 0; i--){
			for(int j = 0; j < 4; j++){
				if(words[i][0] == "" && words[i][1] == "" && words[i][2] == "") break;
				target = target.concat(words[i][j]+" "); 
			}
		}
		return target;
	}

	public static void main(String[] args){
		int num = 123111;
		String string = toString(num);
		System.out.println(string);
	}
}