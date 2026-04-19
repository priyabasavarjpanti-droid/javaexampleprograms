
/*
 2 a. Develop a java program for performing various string operations with different string handling
functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
endsWith()
 */


package lab2;
	public class StringOperations {

	    // 1. String Creation and Basic Operations
	    public static void stringCreation() {
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);
	    }

	    // 2. Length and Character Access
	    public static void lengthAndAccess(String str) {
	        System.out.println("Length: " + str.length());
	        System.out.println("Character at index 2: " + str.charAt(2));
	    }

	    // 3. String Comparison
	    public static void stringComparison() {
	        String a = "Java";
	        String b = "java";
	        System.out.println("Equals: " + a.equals(b));
	        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
	    }

	    // 4. String Searching
	    public static void stringSearching(String str) {
	        System.out.println("Index of 'a': " + str.indexOf('a'));
	        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
	        System.out.println("Contains 'lab': " + str.contains("lab"));
	    }

	    // 5. Substring Operations
	    public static void substringOps(String str) {
	        System.out.println("Substring(1,5): " + str.substring(1, 5));
	    }

	    // 6. String Modification
	    public static void stringModification(String str) {
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        System.out.println("Replace 'a' with 'x': " + str.replace('a', 'x'));
	    }

	    // 7. Whitespace Handling
	    public static void whitespaceHandling() {
	        String str = "   Java Lab   ";
	        System.out.println("Original: '" + str + "'");
	        System.out.println("Trimmed: '" + str.trim() + "'");
	    }

	    // 8. String Concatenation
	    public static void concatenation() {
	        String a = "Hello";
	        String b = "World";
	        String result = a + " " + b;
	        System.out.println("Concatenated: " + result);
	    }

	    // 9. String Splitting
	    public static void stringSplitting() {
	        String str = "Apple,Banana,Orange";
	        String[] fruits = str.split(",");
	        System.out.println("After splitting:");
	        for (String f : fruits) {
	            System.out.println(f);
	        }
	    }

	    // 10. StringBuilder Demo
	    public static void stringBuilderDemo() {
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(4, " Language");
	        sb.replace(0, 4, "Advanced");
	        System.out.println("StringBuilder result: " + sb);
	    }

	    // 11. String Formatting
	    public static void stringFormatting() {
	        String name = "John";
	        int age = 20;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println(formatted);
	    }

	    // 12. Validate Email
	    public static void validateEmail(String email) {
	        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }

	    public static void main(String[] args) {

	        System.out.println("---- String Creation ----");
	        stringCreation();

	        String sample = "java lab program";

	        System.out.println("\n---- Length & Access ----");
	        lengthAndAccess(sample);

	        System.out.println("\n---- Comparison ----");
	        stringComparison();

	        System.out.println("\n---- Searching ----");
	        stringSearching(sample);

	        System.out.println("\n---- Substring ----");
	        substringOps(sample);

	        System.out.println("\n---- Modification ----");
	        stringModification(sample);

	        System.out.println("\n---- Whitespace ----");
	        whitespaceHandling();

	        System.out.println("\n---- Concatenation ----");
	        concatenation();

	        System.out.println("\n---- Splitting ----");
	        stringSplitting();

	        System.out.println("\n---- StringBuilder ----");
	        stringBuilderDemo();

	        System.out.println("\n---- Formatting ----");
	        stringFormatting();

	        System.out.println("\n---- Email Validation ----");
	        validateEmail("user123@gmail.com");
	    }
	}

 
