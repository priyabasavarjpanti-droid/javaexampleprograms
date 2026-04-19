
/*
 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
one is better.
 
 */



package lab2b;

	public class Testperformance{

	    public static void main(String[] args) {

	        int iterations = 10000;

	        // Test with StringBuffer
	        long startBuffer = System.nanoTime();
	        StringBuffer sbf = new StringBuffer();

	        for (int i = 0; i < iterations; i++) {
	            sbf.append("AIET");
	        }

	        long endBuffer = System.nanoTime();
	        long timeBuffer = endBuffer - startBuffer;

	        // Test with StringBuilder
	        long startBuilder = System.nanoTime();
	        StringBuilder sbd = new StringBuilder();

	        for (int i = 0; i < iterations; i++) {
	            sbd.append("AIET");
	        }

	        long endBuilder = System.nanoTime();
	        long timeBuilder = endBuilder - startBuilder;

	        // Results
	        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

	        // Justification
	        if (timeBuffer > timeBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}

 
