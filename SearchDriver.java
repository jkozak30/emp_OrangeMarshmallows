public class SearchDriver {
	static Comparable[] a;
	static long initTime, midTime, finalTime;
	static int binTime, linTime, target;

	public static String compareTime(int numTrials, int length) {
		String result;
		a = new Comparable[length];
		for (int i=0; i<a.length; i++) {
			a[i] = i;
			}

		initTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = (int)(Math.random() * length);
			BinSearch.binSearch(a, target);
		}
		midTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = (int)(Math.random() * length);
			LinSearch.linSearch(a, target);
		}
		finalTime = System.currentTimeMillis();

		binTime = (int)(midTime-initTime);
		linTime = (int)(finalTime-midTime);

		if(binTime < linTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Binary Search was faster by " + toSec(linTime - binTime) + " seconds.";
		} else if (linTime < binTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Linear Search was faster by " + toSec(binTime - linTime) + " seconds.";
		} else {
			result = "For " + numTrials + " searches on arrays of length " + length + ", both searches took " + binTime + " milliseconds.";
		}
		return result;
	}

	public static double toSec(int n){
		double result = (double)(n)/1000;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(compareTime(5000, 1));
		System.out.println(compareTime(5000, 10));
		System.out.println(compareTime(5000, 100));
		System.out.println(compareTime(5000, 1000));
		System.out.println(compareTime(5000, 10000));
		System.out.println(compareTime(5000, 100000));
		System.out.println(compareTime(5000, 1000000));


	}


}
