// two pointer
class RemoveDuplicates{

	public static int removeDuplicates(int[] numbers){
        int j = 0;
		int count = 1;
		int len = numbers.length;
        if(len == 0) return 0;

		for(int i = 0; i < len; i++){
			if(numbers[i] != numbers[j]){
				j = i;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		int[] numbers = {1,3,4,4,5,5,6,6,6,6,7};
		System.out.println(removeDuplicates(numbers));
	}
}