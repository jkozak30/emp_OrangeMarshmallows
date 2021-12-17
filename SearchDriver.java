public class SearchDriver {
	static Comparable[][] a;
	static long initTime, midTime, finalTime; 
	static int target;
	
	public static void compareTime(int numTrials){
		target = (int)(Math.random() * 500);
		a = new Comparable[numTrials][];
		for (int i=0; i<a.length; i++){
			a[i] = new Comparable[(int)(Math.random() * 500)];
			for (int j=0; j<a[i].length; j++) {
				a[i][j] = j;
			}
		}
		
		initTime = System.currentTimeMillis();
		for (Comparable[] n : a) {
			BinSearch.binSearch(n, target);
		}
		midTime = System.currentTimeMillis();
		for (Comparable[] n : a) {
			LinSearch.linSearch(n, target);
		}
		finalTime = System.currentTimeMillis();
		
		int binTime = (int)(midTime-initTime);
		int linTime = (int)(finalTime-midTime);
		
		//add seconds
	}
	
	public static double toSec(long n){
		int result = (double)(n)/1000;
		return result;
	}
	
	
}
