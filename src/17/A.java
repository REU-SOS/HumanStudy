public int numberAboveThreshold(int[] numbers) {
   	final int threshold = 99;
    
   	for (int i = 0; i < numbers.length; i++) {
        int firstNumberAboveThreshold = numbers[i];
		if (firstNumberAboveThreshold  > threshold) {
           	firstNumberAboveThreshold = threshold ;
		}
 
		return firstNumberAboveThreshold;
	}
}
