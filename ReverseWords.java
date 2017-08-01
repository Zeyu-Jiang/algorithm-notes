class ReverseWords{

    public static String reverse(String s) {
        s = s.trim();
        String[] list = s.split("\\s+");
		String target = new String();
		for(int i = list.length-1; i >= 0; i--){
			if(list[i] == "\\s") continue; 
            target = target.concat(list[i]);
			if(i > 0) target = target.concat(" ");
		}
		return target;
    }

	public static void main(String[] args){
		String string = "a  b";
		System.out.println(reverse(string));
	}
}