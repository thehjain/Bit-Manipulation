//Here we have given a number of integer
//and we have to count the total number of set bits
//present in it.

class TotalSetBits {
	public static void main(String[] args) {
		int i = 9;
		System.out.println(countSetBits(i));
	}
	static int countSetBits(int num) {
		int count = 0;
		while (num > 0) {
			count += num & 1;
			num >>= 1;
		}
		return count;
	}
}


//Problem is available on geeksforgeeks