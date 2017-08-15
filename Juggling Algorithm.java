class Array{
	static int[] rotate(int[] target, int n, int len){
		// Juggling Algorithm
		int gcd = gcd(len,n);

		for(int i = 0; i < gcd; i++){
			int j = i;
			int temp = target[j];
			for(; j+gcd < len; j+=gcd){
				target[j] = target[j+gcd];
			}
			target[j] = temp;
		}
		return target;
	}

	// gcd function.
	static int gcd(int a, int b){
		if(b == 0) return a;
		else return gcd(b, a % b);
	}

	public static void main(String[] args){
		int[] list = {1,2,3,4,5,6,7,8,9,10,11,12};
		list = rotate(list,3,12);
		for(int num:list) System.out.print(num+" ");
	}

}