public class Birthday{
	public static int run(int[] s, int d, int m){
		int ways = 0;
		int sum = 0;
		int arraySize = s.length;

		for(int i = 0; i < arraySize ; i++){
			if(i + m > arraySize) break;

			for(int j = i; j < (i + m); j++){
				sum += s[j];
			}

			if(sum == d) ways++;

			sum = 0;
		}
		return ways;
	}
}