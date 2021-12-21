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
			target = (int)(Math.random() * (length * 2 - 1));
			BinSearch.binSearch(a, target);
		}
		midTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = (int)(Math.random() * (length * 2 - 1));
			LinSearch.linSearch(a, target);
		}
		finalTime = System.currentTimeMillis();

		binTime = (int)(midTime-initTime);
		linTime = (int)(finalTime-midTime);

		if(binTime < linTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Binary Search was faster by " + toSec(linTime - binTime) + " seconds";
			result += " (Faster time: " + toSec(binTime) + " seconds).";
		} else if (linTime < binTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Linear Search was faster by " + toSec(binTime - linTime) + " seconds";
			result += " (Faster time: " + toSec(linTime) + " seconds).";
		} else {
			result = "For " + numTrials + " searches on arrays of length " + length + ", both searches took " + toSec(binTime) + " seconds.";
		}
		return result;
	}
	
	public static String compareTimeWorst(int numTrials, int length) {
		String result;
		a = new Comparable[length];
		for (int i=0; i<a.length; i++) {
			a[i] = i;
			}

		initTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = a.length - 1;
			BinSearch.binSearch(a, target);
		}
		midTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = a.length - 1;
			LinSearch.linSearch(a, target);
		}
		finalTime = System.currentTimeMillis();

		binTime = (int)(midTime-initTime);
		linTime = (int)(finalTime-midTime);

		if(binTime < linTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Binary Search was faster by " + toSec(linTime - binTime) + " seconds";
			result += " (Faster time: " + toSec(binTime) + " seconds).";
		} else if (linTime < binTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Linear Search was faster by " + toSec(binTime - linTime) + " seconds";
			result += " (Faster time: " + toSec(linTime) + " seconds).";
		} else {
			result = "For " + numTrials + " searches on arrays of length " + length + ", both searches took " + toSec(binTime) + " seconds.";
		}
		return result;
	}
	
	public static String compareTimeBest(int numTrials, int length) {
		String result;
		a = new Comparable[length];
		for (int i=0; i<a.length; i++) {
			a[i] = i;
			}

		initTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = (a.length-1)/2;
			BinSearch.binSearch(a, target);
		}
		midTime = System.currentTimeMillis();
		for (int i=0; i<numTrials; i++) {
			target = 0;
			LinSearch.linSearch(a, target);
		}
		finalTime = System.currentTimeMillis();

		binTime = (int)(midTime-initTime);
		linTime = (int)(finalTime-midTime);

		if(binTime < linTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Binary Search was faster by " + toSec(linTime - binTime) + " seconds";
			result += " (Faster time: " + toSec(binTime) + " seconds).";
		} else if (linTime < binTime) {
			result = "For " + numTrials + " searches on arrays of length " + length + ", Linear Search was faster by " + toSec(binTime - linTime) + " seconds";
			result += " (Faster time: " + toSec(linTime) + " seconds).";
		} else {
			result = "For " + numTrials + " searches on arrays of length " + length + ", both searches took " + toSec(binTime) + " seconds.";
		}
		return result;
	}

	public static double toSec(int n){
		double result = (double)(n)/1000;
		return result;
	}

	public static void main(String[] args) {
	
		compareTime(10000, 10000);
		System.out.println("Initial lag cleared.");
		
		System.out.println();
		System.out.println("Testing random targets...");
		System.out.println(compareTime(100000, 1));
		System.out.println(compareTime(100000, 10));
		System.out.println(compareTime(100000, 100));
		System.out.println(compareTime(100000, 1000));
		System.out.println(compareTime(100000, 10000));
		System.out.println(compareTime(100000, 100000));
		System.out.println(compareTime(100000, 1000000));
		
		System.out.println();
		System.out.println("Testing worst targets...");
		System.out.println(compareTimeWorst(100000, 1));
		System.out.println(compareTimeWorst(100000, 10));
		System.out.println(compareTimeWorst(100000, 100));
		System.out.println(compareTimeWorst(100000, 1000));
		System.out.println(compareTimeWorst(100000, 10000));
		System.out.println(compareTimeWorst(100000, 100000));
		System.out.println(compareTimeWorst(100000, 1000000));
		
		System.out.println();
		System.out.println("Testing best targets...");
		System.out.println(compareTimeBest(100000, 1));
		System.out.println(compareTimeBest(100000, 10));
		System.out.println(compareTimeBest(100000, 100));
		System.out.println(compareTimeBest(100000, 1000));
		System.out.println(compareTimeBest(100000, 10000));
		System.out.println(compareTimeBest(100000, 100000));
		System.out.println(compareTimeBest(100000, 1000000));
		

	}


}
