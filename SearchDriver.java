public class SearchDriver {
	static Comparable[][] a;
	static long initTime, midTime, finalTime;
	static int binTime, linTime, target;

	public static void compareTime(int numTrials) {
		target = (int)(Math.random() * 1000);
		a = new Comparable[numTrials][];
		for (int i=0; i<a.length; i++) {
			a[i] = new Comparable[(int)(Math.random() * 1000)];
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

		binTime = (int)(midTime-initTime);
		linTime = (int)(finalTime-midTime);

		if(binTime < linTime) {
			System.out.println("For " + numTrials + " searches, Binary Search was faster by " + toSec(linTime - binTime) + " seconds.");
		} else if (linTime < binTime) {
			System.out.println("For " + numTrials + " searches, Linear Search was faster by " + toSec(binTime - linTime) + " seconds.");
		} else {
			System.out.println("For " + numTrials + " searches, both searches took " + binTime + " milliseconds.");
		}
	}

	public static double toSec(int n){
		double result = (double)(n)/1000;
		return result;
	}

	public static void main(String[] args) {
		compareTime(10);
		compareTime(100);
		compareTime(1000);
		compareTime(10000);
		compareTime(100000);
	}


}
