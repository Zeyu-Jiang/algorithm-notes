public class Solution{

	public static String longestCommonPrefix(String[] strs){
		if(strs.length == 0) return "";
		return longestCommonPrefix(strs, 0, strs.length-1);
	}

	private static String longestCommonPrefix(String[] strs, int left, int right){
		if(left == right) return strs[left];
		else{
			int middle = (left+right)/2;
			String stringLeft = longestCommonPrefix(strs, left, middle);
			String stringRight = longestCommonPrefix(strs, middle+1, right);
			return commonString(stringLeft, stringRight); 
		}
	}

	public static String commonString(String left, String right){
		String prefix = new String();
		String target = new String();
		if(left.length() > right.length()){
			prefix = right;
			target = left;
		} 
		else {
			prefix = left;
			target = right;
		}

		while(target.indexOf(prefix) != 0){
			prefix = prefix.substring(0, prefix.length()-1);
			if(prefix.isEmpty()) return "";
		}

		return prefix;
	}

	public static void main(String[] args){
		String[] strs = {"assdbsds","asoed","asdea","asbsgsde","assedet","asefsdf","asddfsdfsd"};
		System.out.println(longestCommonPrefix(strs));
	}
}