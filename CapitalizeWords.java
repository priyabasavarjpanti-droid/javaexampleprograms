package lab3a;

 

	import java.util.Scanner;

	public class CapitalizeWords {

	    // User-defined function
	    public static String capitalizeWords(String str) {

	        String[] words = str.toLowerCase().split("\\s+");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1))
	                      .append(" ");
	            }
	        }

	        return result.toString().trim();
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String output = capitalizeWords(input);

	        System.out.println("Capitalized string: " + output);

	        sc.close();
	    }
	}

 
