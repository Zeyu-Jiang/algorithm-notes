
public class Solution{
	public static String longestCommonPrefix(String[] strs){
		String prefix = strs[0];
		for(int i = 1; i < strs.length; i++){
			if(prefix.length() > strs[i]>length()) prefix = strs[i];
		}

		for(int i = 0; i < strs.length; i++){
			while(strs[i].indexOf(prefix) != 0){ // this is the key code. it is a effective way to check if prefix is a prefix of strs[i].
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
}