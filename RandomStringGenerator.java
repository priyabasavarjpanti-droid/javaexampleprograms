/*
 Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
 */


package lab3a;

	import java.util.Random;
	import java.util.Scanner;

	public class RandomStringGenerator {

	    // User-defined function
	    public static String generateRandomString(int length) {

	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder();
	        Random random = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter required length of random string: ");
	        int length = sc.nextInt();

	        String randomString = generateRandomString(length);

	        System.out.println("Generated Random String: " + randomString);

	        sc.close();
	    }
	
}
