public class LongestCommonString{

	public static int findString(String a, String b){
		int[][] counts = new int[a.length()+1][b.length()+1];

		for(int i = 0; i < a.length()+1; i++) counts[i][0] = 0;
		for(int j = 0; j < b.length()+1; j++) counts[0][j] = 0;	
		
		for(int i = 1; i <= a.length(); i++){
			for(int j = 1; j <= b.length(); j++){
				if(a.charAt(i-1) == b.charAt(j-1)) counts[i][j] = counts[i-1][j-1] + 1; // the index of charAt should be 1 less than i or j. Otherwise, the max value will extends the string length.
				else{
					int max = Math.max(Math.max(counts[i-1][j-1], counts[i-1][j]),counts[i][j-1]);
					counts[i][j] = max;
				}
			}
		}
		int result = counts[a.length()][b.length()];

		return result;
	}

	public static void main(String[] args){
		String a = "GGATCGA";
		String b = "GAATTCAGTTA";

		System.out.println(findString(a,b));
	}
}