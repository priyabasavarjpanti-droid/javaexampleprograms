package lab3a;

 

	import java.util.Scanner;

	public class WordCount {

	    // User-defined function
	    public static int countWords(String str) {

	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }

	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        int count = countWords(input);

	        System.out.println("Number of words: " + count);

	        sc.close();
	    }
	}


