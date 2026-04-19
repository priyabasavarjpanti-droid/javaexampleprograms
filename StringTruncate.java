/*
  Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
 */

package lab3a;
	import java.util.Scanner;

	public class StringTruncate {

	    // User-defined function
	    public static String truncate(String str, int length) {

	        if (str == null) {
	            return null;
	        }

	        if (str.length() <= length) {
	            return str;
	        }

	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.print("Enter maximum length: ");
	        int len = sc.nextInt();

	        String result = truncate(input, len);

	        System.out.println("Truncated string: " + result);

	        sc.close();
	    }
	}
 