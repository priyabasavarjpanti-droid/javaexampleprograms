package prog3a;
 

	 import java.util.Arrays;

	 public class StringOperationsDemo {

	     public static void main(String[] args) {

	         // 1. String Creation and Basic Operations
	         String str1 = "  Hello Java Programming  ";
	         String str2 = "Hello Java Programming";
	         String str3 = new String("Hello Java Programming");

	         System.out.println("Original String: '" + str1 + "'");
	         System.out.println();

	         // 2. Length and Character Access
	         System.out.println("Length of str1: " + str1.length());
	         System.out.println("Character at index 2: " + str1.charAt(2));

	         // 3. Whitespace Handling
	         String trimmed = str1.trim();
	         System.out.println("Trimmed String: '" + trimmed + "'");

	         // 4. String Comparison
	         System.out.println("\nUsing equals(): " + str2.equals(str3));
	         System.out.println("Using == : " + (str2 == str3)); // reference comparison

	         // 5. String Searching
	         System.out.println("\nIndex of 'Java': " + str2.indexOf("Java"));
	         System.out.println("Contains 'Programming': " + str2.contains("Programming"));

	         // 6. Substring Operations
	         System.out.println("\nSubstring (0, 5): " + str2.substring(0, 5));
	         System.out.println("Substring from index 6: " + str2.substring(6));

	         // 7. String Modification
	         System.out.println("\nReplace 'Java' with 'Python': " +
	                 str2.replace("Java", "Python"));

	         // 8. String Concatenation
	         String concat = str2.concat(" - Learn Easily");
	         System.out.println("\nConcatenated String: " + concat);

	         // 9. String Splitting
	         String fruits = "Apple,Banana,Mango,Orange";
	         String[] fruitArray = fruits.split(",");
	         System.out.println("\nSplit String:");
	         System.out.println(Arrays.toString(fruitArray));

	         // 10. StringBuilder Demo
	         StringBuilder sb = new StringBuilder("Hello");
	         sb.append(" World");
	         sb.insert(5, " Java");
	         sb.replace(0, 5, "Hi");
	         System.out.println("\nStringBuilder Result: " + sb);

	         // 11. String Formatting
	         String name = "Ravi";
	         int age = 21;
	         String formatted = String.format("Name: %s, Age: %d", name, age);
	         System.out.println("\nFormatted String: " + formatted);

	         // 12. Email Validation using contains(), startsWith(), endsWith()
	         String email1 = "user@gmail.com";
	         String email2 = "admin@yahoo.com";

	         System.out.println("\nEmail Validation:");
	         validateEmail(email1);
	         validateEmail(email2);
	     }

	     public static void validateEmail(String email) {
	         if (email.contains("@")
	                 && email.startsWith("user")
	                 && email.endsWith(".com")) {
	             System.out.println(email + " -> Valid Email Format");
	         } else {
	             System.out.println(email + " -> Invalid Email Format");
	         }
	     }
	 }